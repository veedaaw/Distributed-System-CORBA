/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUnaryExprMultExpr extends PMultExpr
{
    private PUnaryExpr _unaryExpr_;

    public AUnaryExprMultExpr()
    {
    }

    public AUnaryExprMultExpr(
        PUnaryExpr _unaryExpr_)
    {
        setUnaryExpr(_unaryExpr_);

    }
    public Object clone()
    {
        return new AUnaryExprMultExpr(
            (PUnaryExpr) cloneNode(_unaryExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryExprMultExpr(this);
    }

    public PUnaryExpr getUnaryExpr()
    {
        return _unaryExpr_;
    }

    public void setUnaryExpr(PUnaryExpr node)
    {
        if(_unaryExpr_ != null)
        {
            _unaryExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unaryExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unaryExpr_);
    }

    void removeChild(Node child)
    {
        if(_unaryExpr_ == child)
        {
            _unaryExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unaryExpr_ == oldChild)
        {
            setUnaryExpr((PUnaryExpr) newChild);
            return;
        }

    }
}
