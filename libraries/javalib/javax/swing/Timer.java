/* Timer.java -- 
   Copyright (C) 2002, 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package javax.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.EventListener;

import javax.swing.event.EventListenerList;

public class Timer implements Serializable
{
  private static final long serialVersionUID = -1116180831621385484L;
  
  protected EventListenerList listenerList = new EventListenerList();
  
  // This object manages a "queue" of virtual actionEvents, maintained as a
  // simple long counter. When the timer expires, a new event is queued,
  // and a dispatcher object is pushed into the system event queue. When
  // the system thread runs the dispatcher, it will fire as many
  // ActionEvents as have been queued, unless the timer is set to
  // coalescing mode, in which case it will fire only one ActionEvent.

  private long queue;
  private Object queueLock = new Object();
  private void queueEvent()
  {
    synchronized (queueLock)
      {
        queue++;
        if (queue == 1)
          SwingUtilities.invokeLater(new Runnable() { public void run() { drainEvents(); } });
      }
  }

  private void drainEvents()
  {
    synchronized (queueLock)
      {
        if (isCoalesce())
          {
            if (queue > 0)
              fireActionPerformed();
          }
        else
          {
            while(queue > 0)
              {                  
                fireActionPerformed();
                queue--;
              }          
          }
        queue = 0;
      }
  }
  

  static boolean logTimers;
  boolean coalesce = true;
  boolean repeats = true;
  boolean running;
  int ticks;
  int delay;
  int initialDelay;
    
  private class Waker 
    extends Thread
  {
    public void run()
    {
      running = true;
      try 
        {

          sleep(initialDelay);
          
          while (running)
            {
              sleep(delay);
              queueEvent();
              
              if (logTimers)
                System.out.println("javax.swing.Timer -> clocktick");
              
              if (! repeats)
                break;
            }
          running = false;
      } 
      catch (Exception e) 
        {
          System.out.println("swing.Timer::" + e);
        }
    }
  }

  public Timer(int d, ActionListener listener)
  {
    delay = d;

    if (listener != null)
      addActionListener(listener);
  }

  public void setCoalesce(boolean c)
  {
    coalesce = c;
  }

  public boolean isCoalesce()
  {
    return coalesce;
  }

  public void addActionListener(ActionListener listener)
  {
    listenerList.add (ActionListener.class, listener);
  }
  
  public void removeActionListener(ActionListener listener)
  {
    listenerList.remove (ActionListener.class, listener);
  }

  /**
   * @since 1.3
   */
  public EventListener[] getListeners (Class listenerType)
  {
    return listenerList.getListeners (listenerType);
  }
  
  /**
   * @since 1.4
   */
  public ActionListener[] getActionListeners ()
  {
    return (ActionListener[]) listenerList.getListeners (ActionListener.class);
  }

  protected void fireActionPerformed (ActionEvent event)
  {
    ActionListener[] listeners = getActionListeners();
    
    for (int i = 0; i < listeners.length; i++)
      {
	listeners [i].actionPerformed (event);
      }
  }

  void fireActionPerformed ()
  {
    fireActionPerformed (new ActionEvent (this, ticks++, "Timer"));
  }

  public static void setLogTimers(boolean lt)
  {
    logTimers = lt;
  }

  public static boolean getLogTimers()
  {
    return logTimers;
  }
    
  public void setDelay(int d)
  {
    delay = d;
  }

  public int getDelay()
  {
    return delay;
  }

  public void setInitialDelay(int i)
  {
    initialDelay = i;
  }

  public int getInitialDelay()
  {
    return initialDelay;
  }

  public void setRepeats(boolean r)
  {
    repeats = r;
  }

  public boolean isRepeats()
  {
    return repeats;
  }

  public boolean isRunning()
  {
    return running;
  }

  public void start()
  {
    if (isRunning())
      {
	System.err.println("attempt to start a running timer");
	return;
      }
    new Waker().start();
  }

  public void restart()
  {
    synchronized (queueLock)
      {
        queue = 0;
      }
    start();
  }

  public void stop()
  {
    running = false;
  }
}