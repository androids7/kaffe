/* MemberDoc.java -- Common ops for documenting fields, methods, and constructors
   Copyright (C) 1999 Free Software Foundation, Inc.

This file is part of the com.sun.javadoc implementation of GNU Classpath.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published 
by the Free Software Foundation, either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software Foundation
Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA. */


package com.sun.javadoc;

/**
  * This is the common super-interface for documentation about fields,
  * methods, and constructors.
  */
public interface MemberDoc extends ProgramElementDoc
{

/**
  * This method tests whether the member in question was created implicitly
  * by the compiler.
  *
  * @return <code>true</code> if this member was synthesized by the compiler,
  * </code>false</code> otherwise.
  */
public abstract boolean
isSynthetic();

} // interface MemberDoc

