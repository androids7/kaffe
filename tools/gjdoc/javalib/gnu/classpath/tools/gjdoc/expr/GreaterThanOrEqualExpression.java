/* gnu.classpath.tools.gjdoc.expr.GreaterThanOrEqualExpression
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

package gnu.classpath.tools.gjdoc.expr;

class GreaterThanOrEqualExpression
   extends BinaryRelationExpression
{
   public GreaterThanOrEqualExpression(Expression left, Expression right)
   {
      super(left, right);
   }

   protected boolean compute(double leftValue, double rightValue)
   {
      return leftValue >= rightValue;
   }

   protected boolean compute(float leftValue, float rightValue)
   {
      return leftValue >= rightValue;
   }

   protected boolean compute(long leftValue, long rightValue)
   {
      return leftValue >= rightValue;
   }

   protected boolean compute(int leftValue, int rightValue)
   {
      return leftValue >= rightValue;
   }
}
