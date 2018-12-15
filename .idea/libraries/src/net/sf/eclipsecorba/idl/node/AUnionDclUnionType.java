/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUnionDclUnionType extends PUnionType
{
    private PUnionDcl _unionDcl_;

    public AUnionDclUnionType()
    {
    }

    public AUnionDclUnionType(
        PUnionDcl _unionDcl_)
    {
        setUnionDcl(_unionDcl_);

    }
    public Object clone()
    {
        return new AUnionDclUnionType(
            (PUnionDcl) cloneNode(_unionDcl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnionDclUnionType(this);
    }

    public PUnionDcl getUnionDcl()
    {
        return _unionDcl_;
    }

    public void setUnionDcl(PUnionDcl node)
    {
        if(_unionDcl_ != null)
        {
            _unionDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unionDcl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unionDcl_);
    }

    void removeChild(Node child)
    {
        if(_unionDcl_ == child)
        {
            _unionDcl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unionDcl_ == oldChild)
        {
            setUnionDcl((PUnionDcl) newChild);
            return;
        }

    }
}
