/* gnu.classpath.tools.gjdoc.InheritDocTagImpl
   Copyright (C) 2004 Free Software Foundation, Inc.

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
import java.util.*;
import java.text.*;

/**
 *  Represents the <code>inheritDoc</code> tag.
 */
public class InheritDocTagImpl 
   extends AbstractTagImpl
{
   private ClassDocImpl contextClass;
   private MemberDocImpl contextMember;
   private AbstractTagImpl contextTag;

   public InheritDocTagImpl(ClassDocImpl contextClass,
                            MemberDocImpl contextMember,
                            AbstractTagImpl contextTag)
   {
      super("");
      this.contextClass = contextClass;
      this.contextMember = contextMember;
      this.contextTag = contextTag;
   }

   public String kind() {
      return "@inheritDoc";
   }

   public String name() {
      return "@inheritDoc";
   }

   private TagContainer inheritedDoc;
   private boolean inheritedDocInitialized = false;

   private TagContainer getInheritedDoc()
   {
      if (!inheritedDocInitialized) {
         inheritedDoc = DocImpl.findInheritedDoc(contextClass, contextMember, contextTag);
         inheritedDocInitialized = true;
      }
      return inheritedDoc;
   }

   public Tag[] firstSentenceTags() {
      TagContainer _inheritedDoc = getInheritedDoc();
      if (_inheritedDoc != null) {
         return _inheritedDoc.firstSentenceTags();
      }
      else {
         return null;
      }
   }

   public Tag[] inlineTags() {
      TagContainer _inheritedDoc = getInheritedDoc();
      if (_inheritedDoc != null) {
         return _inheritedDoc.inlineTags();
      }
      else {
         return null;
      }
   }
}
