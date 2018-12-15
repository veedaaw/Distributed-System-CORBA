/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AOrOrExpr extends POrExpr
{
    private POrExpr _orExpr_;
    private TBitOr _bitOr_;
    private PXorExpr _xorExpr_;

    public AOrOrExpr()
    {
    }

    public AOrOrExpr(
        POrExpr _orExpr_,
        TBitOr _bitOr_,
        PXorExpr _xorExpr_)
    {
        setOrExpr(_orExpr_);

        setBitOr(_bitOr_);

        setXorExpr(_xorExpr_);

    }
    public Object clone()
    {
        return new AOrOrExpr(
            (POrExpr) cloneNode(_orExpr_),
            (TBitOr) cloneNode(_bitOr_),
            (PXorExpr) cloneNode(_xorExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrOrExpr(this);
    }

    public POrExpr getOrExpr()
    {
        return _orExpr_;
    }

    public void setOrExpr(POrExpr node)
    {
        if(_orExpr_ != null)
        {
            _orExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _orExpr_ = node;
    }

    public TBitOr getBitOr()
    {
        return _bitOr_;
    }

    public void setBitOr(TBitOr node)
    {
        if(_bitOr_ != null)
        {
            _bitOr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _bitOr_ = node;
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
            + toString(_orExpr_)
            + toString(_bitOr_)
            + toString(_xorExpr_);
    }

    void removeChild(Node child)
    {
        if(_orExpr_ == child)
        {
            _orExpr_ = null;
            return;
        }

        if(_bitOr_ == child)
        {
            _bitOr_ = null;
            return;
        }

        if(_xorExpr_ == child)
        {
            _xorExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_orExpr_ == oldChild)
        {
            setOrExpr((POrExpr) newChild);
            return;
        }

        if(_bitOr_ == oldChild)
        {
            setBitOr((TBitOr) newChild);
            return;
        }

        if(_xorExpr_ == oldChild)
        {
            setXorExpr((PXorExpr) newChild);
            return;
        }

    }
}
