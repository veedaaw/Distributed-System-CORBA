/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TTrue extends Token
{
    public TTrue(String text)
    {
        setText(text);
    }

    public TTrue(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TTrue(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTrue(this);
    }
}
