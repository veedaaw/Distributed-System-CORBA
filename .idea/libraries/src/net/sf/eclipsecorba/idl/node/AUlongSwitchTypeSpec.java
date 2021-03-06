/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUlongSwitchTypeSpec extends PSwitchTypeSpec
{
    private PUnsignedLongInt _unsignedLongInt_;

    public AUlongSwitchTypeSpec()
    {
    }

    public AUlongSwitchTypeSpec(
        PUnsignedLongInt _unsignedLongInt_)
    {
        setUnsignedLongInt(_unsignedLongInt_);

    }
    public Object clone()
    {
        return new AUlongSwitchTypeSpec(
            (PUnsignedLongInt) cloneNode(_unsignedLongInt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUlongSwitchTypeSpec(this);
    }

    public PUnsignedLongInt getUnsignedLongInt()
    {
        return _unsignedLongInt_;
    }

    public void setUnsignedLongInt(PUnsignedLongInt node)
    {
        if(_unsignedLongInt_ != null)
        {
            _unsignedLongInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unsignedLongInt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unsignedLongInt_);
    }

    void removeChild(Node child)
    {
        if(_unsignedLongInt_ == child)
        {
            _unsignedLongInt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unsignedLongInt_ == oldChild)
        {
            setUnsignedLongInt((PUnsignedLongInt) newChild);
            return;
        }

    }
}
