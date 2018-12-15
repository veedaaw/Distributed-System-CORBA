/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AMultExprAddExpr extends PAddExpr
{
    private PMultExpr _multExpr_;

    public AMultExprAddExpr()
    {
    }

    public AMultExprAddExpr(
        PMultExpr _multExpr_)
    {
        setMultExpr(_multExpr_);

    }
    public Object clone()
    {
        return new AMultExprAddExpr(
            (PMultExpr) cloneNode(_multExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultExprAddExpr(this);
    }

    public PMultExpr getMultExpr()
    {
        return _multExpr_;
    }

    public void setMultExpr(PMultExpr node)
    {
        if(_multExpr_ != null)
        {
            _multExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_multExpr_);
    }

    void removeChild(Node child)
    {
        if(_multExpr_ == child)
        {
            _multExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_multExpr_ == oldChild)
        {
            setMultExpr((PMultExpr) newChild);
            return;
        }

    }
}