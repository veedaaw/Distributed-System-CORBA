/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TTruncatable extends Token
{
    public TTruncatable(String text)
    {
        setText(text);
    }

    public TTruncatable(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TTruncatable(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTruncatable(this);
    }
}