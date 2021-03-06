/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AFloatLiteral extends PLiteral
{
    private TFloatingPtLiteral _floatingPtLiteral_;

    public AFloatLiteral()
    {
    }

    public AFloatLiteral(
        TFloatingPtLiteral _floatingPtLiteral_)
    {
        setFloatingPtLiteral(_floatingPtLiteral_);

    }
    public Object clone()
    {
        return new AFloatLiteral(
            (TFloatingPtLiteral) cloneNode(_floatingPtLiteral_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatLiteral(this);
    }

    public TFloatingPtLiteral getFloatingPtLiteral()
    {
        return _floatingPtLiteral_;
    }

    public void setFloatingPtLiteral(TFloatingPtLiteral node)
    {
        if(_floatingPtLiteral_ != null)
        {
            _floatingPtLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _floatingPtLiteral_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_floatingPtLiteral_);
    }

    void removeChild(Node child)
    {
        if(_floatingPtLiteral_ == child)
        {
            _floatingPtLiteral_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_floatingPtLiteral_ == oldChild)
        {
            setFloatingPtLiteral((TFloatingPtLiteral) newChild);
            return;
        }

    }
}
