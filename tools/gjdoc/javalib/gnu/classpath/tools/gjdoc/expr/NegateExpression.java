/* gnu.classpath.tools.gjdoc.expr.NegateExpression
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

class NegateExpression
   extends UnaryExpression
{
   protected NegateExpression(Expression expr)
   {
      super(expr);
   }

   public ConstantExpression evaluate(Context context)
      throws IllegalExpressionException
   {
      ConstantExpression value = expr.evaluate(context);

      if (Type.LONG == value.getType()) {
         return new ConstantLong(-value.asNumber().longValue());
      }
      else if (Type.DOUBLE == value.getType()) {
         return new ConstantDouble(-value.asNumber().doubleValue());
      }
      else if (Type.FLOAT == value.getType()) {
         return new ConstantDouble(-value.asNumber().floatValue());
      }
      else {
         return new ConstantInteger(-value.asNumber().intValue());
      }
   }
}
