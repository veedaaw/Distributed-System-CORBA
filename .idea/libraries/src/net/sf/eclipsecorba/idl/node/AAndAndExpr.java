/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AAndAndExpr extends PAndExpr
{
    private PAndExpr _andExpr_;
    private TBitAnd _bitAnd_;
    private PShiftExpr _shiftExpr_;

    public AAndAndExpr()
    {
    }

    public AAndAndExpr(
        PAndExpr _andExpr_,
        TBitAnd _bitAnd_,
        PShiftExpr _shiftExpr_)
    {
        setAndExpr(_andExpr_);

        setBitAnd(_bitAnd_);

        setShiftExpr(_shiftExpr_);

    }
    public Object clone()
    {
        return new AAndAndExpr(
            (PAndExpr) cloneNode(_andExpr_),
            (TBitAnd) cloneNode(_bitAnd_),
            (PShiftExpr) cloneNode(_shiftExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndAndExpr(this);
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

    public TBitAnd getBitAnd()
    {
        return _bitAnd_;
    }

    public void setBitAnd(TBitAnd node)
    {
        if(_bitAnd_ != null)
        {
            _bitAnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _bitAnd_ = node;
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
            + toString(_andExpr_)
            + toString(_bitAnd_)
            + toString(_shiftExpr_);
    }

    void removeChild(Node child)
    {
        if(_andExpr_ == child)
        {
            _andExpr_ = null;
            return;
        }

        if(_bitAnd_ == child)
        {
            _bitAnd_ = null;
            return;
        }

        if(_shiftExpr_ == child)
        {
            _shiftExpr_ = null;
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

        if(_bitAnd_ == oldChild)
        {
            setBitAnd((TBitAnd) newChild);
            return;
        }

        if(_shiftExpr_ == oldChild)
        {
            setShiftExpr((PShiftExpr) newChild);
            return;
        }

    }
}
