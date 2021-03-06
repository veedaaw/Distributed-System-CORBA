/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AForwardDclUnionType extends PUnionType
{
    private PUnionForwardDcl _unionForwardDcl_;

    public AForwardDclUnionType()
    {
    }

    public AForwardDclUnionType(
        PUnionForwardDcl _unionForwardDcl_)
    {
        setUnionForwardDcl(_unionForwardDcl_);

    }
    public Object clone()
    {
        return new AForwardDclUnionType(
            (PUnionForwardDcl) cloneNode(_unionForwardDcl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForwardDclUnionType(this);
    }

    public PUnionForwardDcl getUnionForwardDcl()
    {
        return _unionForwardDcl_;
    }

    public void setUnionForwardDcl(PUnionForwardDcl node)
    {
        if(_unionForwardDcl_ != null)
        {
            _unionForwardDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unionForwardDcl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unionForwardDcl_);
    }

    void removeChild(Node child)
    {
        if(_unionForwardDcl_ == child)
        {
            _unionForwardDcl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unionForwardDcl_ == oldChild)
        {
            setUnionForwardDcl((PUnionForwardDcl) newChild);
            return;
        }

    }
}
