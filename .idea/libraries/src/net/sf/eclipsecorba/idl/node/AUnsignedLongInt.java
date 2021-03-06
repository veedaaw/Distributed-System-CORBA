/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUnsignedLongInt extends PUnsignedLongInt
{
    private TUnsigned _unsigned_;
    private TLong _long_;

    public AUnsignedLongInt()
    {
    }

    public AUnsignedLongInt(
        TUnsigned _unsigned_,
        TLong _long_)
    {
        setUnsigned(_unsigned_);

        setLong(_long_);

    }
    public Object clone()
    {
        return new AUnsignedLongInt(
            (TUnsigned) cloneNode(_unsigned_),
            (TLong) cloneNode(_long_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnsignedLongInt(this);
    }

    public TUnsigned getUnsigned()
    {
        return _unsigned_;
    }

    public void setUnsigned(TUnsigned node)
    {
        if(_unsigned_ != null)
        {
            _unsigned_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unsigned_ = node;
    }

    public TLong getLong()
    {
        return _long_;
    }

    public void setLong(TLong node)
    {
        if(_long_ != null)
        {
            _long_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _long_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unsigned_)
            + toString(_long_);
    }

    void removeChild(Node child)
    {
        if(_unsigned_ == child)
        {
            _unsigned_ = null;
            return;
        }

        if(_long_ == child)
        {
            _long_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unsigned_ == oldChild)
        {
            setUnsigned((TUnsigned) newChild);
            return;
        }

        if(_long_ == oldChild)
        {
            setLong((TLong) newChild);
            return;
        }

    }
}
