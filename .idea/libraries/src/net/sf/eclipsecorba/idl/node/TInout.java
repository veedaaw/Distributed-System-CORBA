/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TInout extends Token
{
    public TInout(String text)
    {
        setText(text);
    }

    public TInout(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TInout(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInout(this);
    }
}