/**
 * WMEvent - 
 *
 * Copyright (c) 1998
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution 
 * of this file. 
 *
 * @author P. Mehlitz
 */

package java.awt;

class WMEvent
  extends AWTEvent
{
	final static int WM_CREATE = 1901;
	final static int WM_DESTROY = 1902;
	final static int WM_DISPATCH_MODAL = 1903;
	final static int WM_SHOW = 1904;

WMEvent ( Window source, int id ) {
	super( source, id);
}

protected synchronized void dispatch () {
	Window w = (Window) source;

	switch ( id ) {
	
	case WM_CREATE:
		w.addNotify();
		this.notifyAll();
		break;
		
	case WM_DESTROY:
		w.removeNotify();
		this.notifyAll();
		break;
		
	case WM_DISPATCH_MODAL:
		Toolkit.eventThread.run( w);
		this.notifyAll();
		break;
		
	case WM_SHOW:
		Toolkit.eventThread.show( w);
		this.notifyAll();
		break;
	}
}
}
