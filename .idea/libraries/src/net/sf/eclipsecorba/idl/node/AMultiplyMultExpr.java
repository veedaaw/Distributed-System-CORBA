/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AMultiplyMultExpr extends PMultExpr
{
    private PMultExpr _multExpr_;
    private TStar _star_;
    private PUnaryExpr _unaryExpr_;

    public AMultiplyMultExpr()
    {
    }

    public AMultiplyMultExpr(
        PMultExpr _multExpr_,
        TStar _star_,
        PUnaryExpr _unaryExpr_)
    {
        setMultExpr(_multExpr_);

        setStar(_star_);

        setUnaryExpr(_unaryExpr_);

    }
    public Object clone()
    {
        return new AMultiplyMultExpr(
            (PMultExpr) cloneNode(_multExpr_),
            (TStar) cloneNode(_star_),
            (PUnaryExpr) cloneNode(_unaryExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplyMultExpr(this);
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

    public TStar getStar()
    {
        return _star_;
    }

    public void setStar(TStar node)
    {
        if(_star_ != null)
        {
            _star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _star_ = node;
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
            + toString(_multExpr_)
            + toString(_star_)
            + toString(_unaryExpr_);
    }

    void removeChild(Node child)
    {
        if(_multExpr_ == child)
        {
            _multExpr_ = null;
            return;
        }

        if(_star_ == child)
        {
            _star_ = null;
            return;
        }

        if(_unaryExpr_ == child)
        {
            _unaryExpr_ = null;
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

        if(_star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        if(_unaryExpr_ == oldChild)
        {
            setUnaryExpr((PUnaryExpr) newChild);
            return;
        }

    }
}
