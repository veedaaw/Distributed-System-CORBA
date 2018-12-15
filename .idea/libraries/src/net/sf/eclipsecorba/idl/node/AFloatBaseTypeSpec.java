/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AFloatBaseTypeSpec extends PBaseTypeSpec
{
    private PFloatingPtType _floatingPtType_;

    public AFloatBaseTypeSpec()
    {
    }

    public AFloatBaseTypeSpec(
        PFloatingPtType _floatingPtType_)
    {
        setFloatingPtType(_floatingPtType_);

    }
    public Object clone()
    {
        return new AFloatBaseTypeSpec(
            (PFloatingPtType) cloneNode(_floatingPtType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatBaseTypeSpec(this);
    }

    public PFloatingPtType getFloatingPtType()
    {
        return _floatingPtType_;
    }

    public void setFloatingPtType(PFloatingPtType node)
    {
        if(_floatingPtType_ != null)
        {
            _floatingPtType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _floatingPtType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_floatingPtType_);
    }

    void removeChild(Node child)
    {
        if(_floatingPtType_ == child)
        {
            _floatingPtType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_floatingPtType_ == oldChild)
        {
            setFloatingPtType((PFloatingPtType) newChild);
            return;
        }

    }
}
