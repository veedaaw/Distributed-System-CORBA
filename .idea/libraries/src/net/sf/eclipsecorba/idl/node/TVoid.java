/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class TVoid extends Token
{
    public TVoid(String text)
    {
        setText(text);
    }

    public TVoid(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVoid(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVoid(this);
    }
}