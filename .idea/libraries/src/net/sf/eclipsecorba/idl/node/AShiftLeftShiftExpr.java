/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AShiftLeftShiftExpr extends PShiftExpr
{
    private PShiftExpr _shiftExpr_;
    private TShiftLeft _shiftLeft_;
    private PAddExpr _addExpr_;

    public AShiftLeftShiftExpr()
    {
    }

    public AShiftLeftShiftExpr(
        PShiftExpr _shiftExpr_,
        TShiftLeft _shiftLeft_,
        PAddExpr _addExpr_)
    {
        setShiftExpr(_shiftExpr_);

        setShiftLeft(_shiftLeft_);

        setAddExpr(_addExpr_);

    }
    public Object clone()
    {
        return new AShiftLeftShiftExpr(
            (PShiftExpr) cloneNode(_shiftExpr_),
            (TShiftLeft) cloneNode(_shiftLeft_),
            (PAddExpr) cloneNode(_addExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShiftLeftShiftExpr(this);
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

    public TShiftLeft getShiftLeft()
    {
        return _shiftLeft_;
    }

    public void setShiftLeft(TShiftLeft node)
    {
        if(_shiftLeft_ != null)
        {
            _shiftLeft_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _shiftLeft_ = node;
    }

    public PAddExpr getAddExpr()
    {
        return _addExpr_;
    }

    public void setAddExpr(PAddExpr node)
    {
        if(_addExpr_ != null)
        {
            _addExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _addExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_shiftExpr_)
            + toString(_shiftLeft_)
            + toString(_addExpr_);
    }

    void removeChild(Node child)
    {
        if(_shiftExpr_ == child)
        {
            _shiftExpr_ = null;
            return;
        }

        if(_shiftLeft_ == child)
        {
            _shiftLeft_ = null;
            return;
        }

        if(_addExpr_ == child)
        {
            _addExpr_ = null;
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

        if(_shiftLeft_ == oldChild)
        {
            setShiftLeft((TShiftLeft) newChild);
            return;
        }

        if(_addExpr_ == oldChild)
        {
            setAddExpr((PAddExpr) newChild);
            return;
        }

    }
}
