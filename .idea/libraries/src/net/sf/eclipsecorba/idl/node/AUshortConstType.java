/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUshortConstType extends PConstType
{
    private PUnsignedShortInt _unsignedShortInt_;

    public AUshortConstType()
    {
    }

    public AUshortConstType(
        PUnsignedShortInt _unsignedShortInt_)
    {
        setUnsignedShortInt(_unsignedShortInt_);

    }
    public Object clone()
    {
        return new AUshortConstType(
            (PUnsignedShortInt) cloneNode(_unsignedShortInt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUshortConstType(this);
    }

    public PUnsignedShortInt getUnsignedShortInt()
    {
        return _unsignedShortInt_;
    }

    public void setUnsignedShortInt(PUnsignedShortInt node)
    {
        if(_unsignedShortInt_ != null)
        {
            _unsignedShortInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unsignedShortInt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unsignedShortInt_);
    }

    void removeChild(Node child)
    {
        if(_unsignedShortInt_ == child)
        {
            _unsignedShortInt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unsignedShortInt_ == oldChild)
        {
            setUnsignedShortInt((PUnsignedShortInt) newChild);
            return;
        }

    }
}
