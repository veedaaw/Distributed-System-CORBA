/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TCustom extends Token
{
    public TCustom(String text)
    {
        setText(text);
    }

    public TCustom(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TCustom(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCustom(this);
    }
}
