/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class APositiveStringType extends PStringType
{
    private TString _string_;
    private TLt _lt_;
    private POrExpr _orExpr_;
    private TGt _gt_;

    public APositiveStringType()
    {
    }

    public APositiveStringType(
        TString _string_,
        TLt _lt_,
        POrExpr _orExpr_,
        TGt _gt_)
    {
        setString(_string_);

        setLt(_lt_);

        setOrExpr(_orExpr_);

        setGt(_gt_);

    }
    public Object clone()
    {
        return new APositiveStringType(
            (TString) cloneNode(_string_),
            (TLt) cloneNode(_lt_),
            (POrExpr) cloneNode(_orExpr_),
            (TGt) cloneNode(_gt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPositiveStringType(this);
    }

    public TString getString()
    {
        return _string_;
    }

    public void setString(TString node)
    {
        if(_string_ != null)
        {
            _string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _string_ = node;
    }

    public TLt getLt()
    {
        return _lt_;
    }

    public void setLt(TLt node)
    {
        if(_lt_ != null)
        {
            _lt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lt_ = node;
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

    public TGt getGt()
    {
        return _gt_;
    }

    public void setGt(TGt node)
    {
        if(_gt_ != null)
        {
            _gt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _gt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_string_)
            + toString(_lt_)
            + toString(_orExpr_)
            + toString(_gt_);
    }

    void removeChild(Node child)
    {
        if(_string_ == child)
        {
            _string_ = null;
            return;
        }

        if(_lt_ == child)
        {
            _lt_ = null;
            return;
        }

        if(_orExpr_ == child)
        {
            _orExpr_ = null;
            return;
        }

        if(_gt_ == child)
        {
            _gt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_string_ == oldChild)
        {
            setString((TString) newChild);
            return;
        }

        if(_lt_ == oldChild)
        {
            setLt((TLt) newChild);
            return;
        }

        if(_orExpr_ == oldChild)
        {
            setOrExpr((POrExpr) newChild);
            return;
        }

        if(_gt_ == oldChild)
        {
            setGt((TGt) newChild);
            return;
        }

    }
}