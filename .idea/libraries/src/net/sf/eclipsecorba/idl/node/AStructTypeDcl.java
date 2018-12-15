/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AStructTypeDcl extends PTypeDcl
{
    private PStructType _structType_;

    public AStructTypeDcl()
    {
    }

    public AStructTypeDcl(
        PStructType _structType_)
    {
        setStructType(_structType_);

    }
    public Object clone()
    {
        return new AStructTypeDcl(
            (PStructType) cloneNode(_structType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStructTypeDcl(this);
    }

    public PStructType getStructType()
    {
        return _structType_;
    }

    public void setStructType(PStructType node)
    {
        if(_structType_ != null)
        {
            _structType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _structType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_structType_);
    }

    void removeChild(Node child)
    {
        if(_structType_ == child)
        {
            _structType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_structType_ == oldChild)
        {
            setStructType((PStructType) newChild);
            return;
        }

    }
}
