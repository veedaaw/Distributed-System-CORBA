/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AAndExprXorExpr extends PXorExpr
{
    private PAndExpr _andExpr_;

    public AAndExprXorExpr()
    {
    }

    public AAndExprXorExpr(
        PAndExpr _andExpr_)
    {
        setAndExpr(_andExpr_);

    }
    public Object clone()
    {
        return new AAndExprXorExpr(
            (PAndExpr) cloneNode(_andExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndExprXorExpr(this);
    }

    public PAndExpr getAndExpr()
    {
        return _andExpr_;
    }

    public void setAndExpr(PAndExpr node)
    {
        if(_andExpr_ != null)
        {
            _andExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _andExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_andExpr_);
    }

    void removeChild(Node child)
    {
        if(_andExpr_ == child)
        {
            _andExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_andExpr_ == oldChild)
        {
            setAndExpr((PAndExpr) newChild);
            return;
        }

    }
}
