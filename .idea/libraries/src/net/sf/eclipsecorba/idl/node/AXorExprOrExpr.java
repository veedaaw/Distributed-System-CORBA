/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AXorExprOrExpr extends POrExpr
{
    private PXorExpr _xorExpr_;

    public AXorExprOrExpr()
    {
    }

    public AXorExprOrExpr(
        PXorExpr _xorExpr_)
    {
        setXorExpr(_xorExpr_);

    }
    public Object clone()
    {
        return new AXorExprOrExpr(
            (PXorExpr) cloneNode(_xorExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorExprOrExpr(this);
    }

    public PXorExpr getXorExpr()
    {
        return _xorExpr_;
    }

    public void setXorExpr(PXorExpr node)
    {
        if(_xorExpr_ != null)
        {
            _xorExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xorExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_xorExpr_);
    }

    void removeChild(Node child)
    {
        if(_xorExpr_ == child)
        {
            _xorExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_xorExpr_ == oldChild)
        {
            setXorExpr((PXorExpr) newChild);
            return;
        }

    }
}
