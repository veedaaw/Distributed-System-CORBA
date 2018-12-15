/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AOutParamAttribute extends PParamAttribute
{
    private TOut _out_;

    public AOutParamAttribute()
    {
    }

    public AOutParamAttribute(
        TOut _out_)
    {
        setOut(_out_);

    }
    public Object clone()
    {
        return new AOutParamAttribute(
            (TOut) cloneNode(_out_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOutParamAttribute(this);
    }

    public TOut getOut()
    {
        return _out_;
    }

    public void setOut(TOut node)
    {
        if(_out_ != null)
        {
            _out_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _out_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_out_);
    }

    void removeChild(Node child)
    {
        if(_out_ == child)
        {
            _out_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_out_ == oldChild)
        {
            setOut((TOut) newChild);
            return;
        }

    }
}
