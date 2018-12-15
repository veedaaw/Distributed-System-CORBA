/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AXorXorExpr extends PXorExpr
{
    private PXorExpr _xorExpr_;
    private TBitXor _bitXor_;
    private PAndExpr _andExpr_;

    public AXorXorExpr()
    {
    }

    public AXorXorExpr(
        PXorExpr _xorExpr_,
        TBitXor _bitXor_,
        PAndExpr _andExpr_)
    {
        setXorExpr(_xorExpr_);

        setBitXor(_bitXor_);

        setAndExpr(_andExpr_);

    }
    public Object clone()
    {
        return new AXorXorExpr(
            (PXorExpr) cloneNode(_xorExpr_),
            (TBitXor) cloneNode(_bitXor_),
            (PAndExpr) cloneNode(_andExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorXorExpr(this);
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

    public TBitXor getBitXor()
    {
        return _bitXor_;
    }

    public void setBitXor(TBitXor node)
    {
        if(_bitXor_ != null)
        {
            _bitXor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _bitXor_ = node;
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
            + toString(_xorExpr_)
            + toString(_bitXor_)
            + toString(_andExpr_);
    }

    void removeChild(Node child)
    {
        if(_xorExpr_ == child)
        {
            _xorExpr_ = null;
            return;
        }

        if(_bitXor_ == child)
        {
            _bitXor_ = null;
            return;
        }

        if(_andExpr_ == child)
        {
            _andExpr_ = null;
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

        if(_bitXor_ == oldChild)
        {
            setBitXor((TBitXor) newChild);
            return;
        }

        if(_andExpr_ == oldChild)
        {
            setAndExpr((PAndExpr) newChild);
            return;
        }

    }
}
