/*
 * $Id: Logger.java,v 1.6 2005/07/04 00:05:19 robilad Exp $
 * Copyright (C) 2003 The Free Software Foundation
 * 
 * This file is part of GNU inetlib, a library.
 * 
 * GNU inetlib is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * GNU inetlib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library.  Thus, the terms and
 * conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obliged to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package gnu.inet.util;

/**
 * Provides a simple logging mechanism for GNU inetlib and providers.
 * It is not possible to use the java.logging API as this doesn't exist
 * prior to Java 1.4.
 *
 * @author <a href="mailto:dog@gnu.org">Chris Burdess</a>
 */
public abstract class Logger
{

  /**
   * The singleton instance of this class.
   */
  private static Logger instance = new StderrLogger ();

  /**
   * Returns the singleton instance of this class.
   */
  public static Logger getInstance ()
    {
      return instance;
    }

  /**
   * Sets the singleton instance of this class.
   * @param logger the new logger to use
   */
  public static void setInstance (Logger logger)
    {
      if (logger == null)
        {
          throw new NullPointerException ();
        }
      instance = logger;
    }

  /**
   * Logs a configuration message.
   * This is used by the inetlib implementation itself.
   * @param message the message
   */
  public abstract void config (String message);

  /**
   * Logs a provider-specific debugging message.
   * @param protocol the provider protocol
   * @param message the message
   */
  public abstract void log (String protocol, String message);

  /**
   * Logs an error.
   * @param protocol the provider protocol
   * @param message the message
   */
  public abstract void error (String protocol, Throwable t);

}
