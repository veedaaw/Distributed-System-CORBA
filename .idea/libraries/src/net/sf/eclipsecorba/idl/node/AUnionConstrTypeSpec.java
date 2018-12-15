/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUnionConstrTypeSpec extends PConstrTypeSpec
{
    private PUnionType _unionType_;

    public AUnionConstrTypeSpec()
    {
    }

    public AUnionConstrTypeSpec(
        PUnionType _unionType_)
    {
        setUnionType(_unionType_);

    }
    public Object clone()
    {
        return new AUnionConstrTypeSpec(
            (PUnionType) cloneNode(_unionType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnionConstrTypeSpec(this);
    }

    public PUnionType getUnionType()
    {
        return _unionType_;
    }

    public void setUnionType(PUnionType node)
    {
        if(_unionType_ != null)
        {
            _unionType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unionType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unionType_);
    }

    void removeChild(Node child)
    {
        if(_unionType_ == child)
        {
            _unionType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unionType_ == oldChild)
        {
            setUnionType((PUnionType) newChild);
            return;
        }

    }
}
