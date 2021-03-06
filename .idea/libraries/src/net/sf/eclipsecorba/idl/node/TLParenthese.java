/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TLParenthese extends Token
{
    public TLParenthese()
    {
        super.setText("(");
    }

    public TLParenthese(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLParenthese(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLParenthese(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLParenthese text.");
    }
}
