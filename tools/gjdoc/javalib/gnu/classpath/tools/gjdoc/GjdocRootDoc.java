/* gnu.classpath.tools.gjdoc.GjdocRootDoc
   Copyright (C) 2001 Free Software Foundation, Inc.

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
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA. */

package gnu.classpath.tools.gjdoc;

import java.io.File;
import com.sun.javadoc.RootDoc;

/**
 *  Extension of the RootDoc interface which additionally provides
 *  a method for flushing all state.
 *
 *  @author Julian Scheid
 */
public interface GjdocRootDoc extends RootDoc
{
   /**
    *  Invalidate this RootDoc by flushing all associated data, but
    *  keep its error reporting functionality intact.
    */
   public void flush();
}
