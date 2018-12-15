/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AIntegerLiteral extends PLiteral
{
    private TIntegerLiteral _integerLiteral_;

    public AIntegerLiteral()
    {
    }

    public AIntegerLiteral(
        TIntegerLiteral _integerLiteral_)
    {
        setIntegerLiteral(_integerLiteral_);

    }
    public Object clone()
    {
        return new AIntegerLiteral(
            (TIntegerLiteral) cloneNode(_integerLiteral_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntegerLiteral(this);
    }

    public TIntegerLiteral getIntegerLiteral()
    {
        return _integerLiteral_;
    }

    public void setIntegerLiteral(TIntegerLiteral node)
    {
        if(_integerLiteral_ != null)
        {
            _integerLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _integerLiteral_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_integerLiteral_);
    }

    void removeChild(Node child)
    {
        if(_integerLiteral_ == child)
        {
            _integerLiteral_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_integerLiteral_ == oldChild)
        {
            setIntegerLiteral((TIntegerLiteral) newChild);
            return;
        }

    }
}