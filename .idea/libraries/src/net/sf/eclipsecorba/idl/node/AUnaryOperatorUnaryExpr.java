/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AUnaryOperatorUnaryExpr extends PUnaryExpr
{
    private PUnaryOperator _unaryOperator_;
    private PPrimaryExpr _primaryExpr_;

    public AUnaryOperatorUnaryExpr()
    {
    }

    public AUnaryOperatorUnaryExpr(
        PUnaryOperator _unaryOperator_,
        PPrimaryExpr _primaryExpr_)
    {
        setUnaryOperator(_unaryOperator_);

        setPrimaryExpr(_primaryExpr_);

    }
    public Object clone()
    {
        return new AUnaryOperatorUnaryExpr(
            (PUnaryOperator) cloneNode(_unaryOperator_),
            (PPrimaryExpr) cloneNode(_primaryExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryOperatorUnaryExpr(this);
    }

    public PUnaryOperator getUnaryOperator()
    {
        return _unaryOperator_;
    }

    public void setUnaryOperator(PUnaryOperator node)
    {
        if(_unaryOperator_ != null)
        {
            _unaryOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unaryOperator_ = node;
    }

    public PPrimaryExpr getPrimaryExpr()
    {
        return _primaryExpr_;
    }

    public void setPrimaryExpr(PPrimaryExpr node)
    {
        if(_primaryExpr_ != null)
        {
            _primaryExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _primaryExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unaryOperator_)
            + toString(_primaryExpr_);
    }

    void removeChild(Node child)
    {
        if(_unaryOperator_ == child)
        {
            _unaryOperator_ = null;
            return;
        }

        if(_primaryExpr_ == child)
        {
            _primaryExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unaryOperator_ == oldChild)
        {
            setUnaryOperator((PUnaryOperator) newChild);
            return;
        }

        if(_primaryExpr_ == oldChild)
        {
            setPrimaryExpr((PPrimaryExpr) newChild);
            return;
        }

    }
}
