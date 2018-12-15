/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AShiftExprAndExpr extends PAndExpr
{
    private PShiftExpr _shiftExpr_;

    public AShiftExprAndExpr()
    {
    }

    public AShiftExprAndExpr(
        PShiftExpr _shiftExpr_)
    {
        setShiftExpr(_shiftExpr_);

    }
    public Object clone()
    {
        return new AShiftExprAndExpr(
            (PShiftExpr) cloneNode(_shiftExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShiftExprAndExpr(this);
    }

    public PShiftExpr getShiftExpr()
    {
        return _shiftExpr_;
    }

    public void setShiftExpr(PShiftExpr node)
    {
        if(_shiftExpr_ != null)
        {
            _shiftExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _shiftExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_shiftExpr_);
    }

    void removeChild(Node child)
    {
        if(_shiftExpr_ == child)
        {
            _shiftExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_shiftExpr_ == oldChild)
        {
            setShiftExpr((PShiftExpr) newChild);
            return;
        }

    }
}