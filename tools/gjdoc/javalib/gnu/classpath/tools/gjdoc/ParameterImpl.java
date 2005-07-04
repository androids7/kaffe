/* gnu.classpath.tools.gjdoc.ParameterImpl
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

import com.sun.javadoc.*;

public class ParameterImpl implements Parameter {

   String name;
   String typeName;
   Type type;

   ParameterImpl(String name, String typeName, Type type) {

      this.name=name;
      this.typeName=typeName;
      this.type=type;
   }

   public void resolve(ClassDoc classContext) {
      if (type instanceof ClassDocProxy) {
	 String className=type.qualifiedTypeName();
	 ClassDoc realClassDoc=classContext.findClass(className);
	 if (realClassDoc!=null)
	    type=realClassDoc;
	 else {
	    type=new TypeImpl(null, className, type.dimension());
	 }
      }
   }

   public String name() { return name; }
   public String typeName() { return typeName; }
   public Type type() { return type; }
   public String toString() { return typeName+" "+name; }
}
