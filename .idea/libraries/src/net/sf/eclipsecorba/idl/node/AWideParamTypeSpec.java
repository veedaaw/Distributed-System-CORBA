/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AWideParamTypeSpec extends PParamTypeSpec
{
    private PWideStringType _wideStringType_;

    public AWideParamTypeSpec()
    {
    }

    public AWideParamTypeSpec(
        PWideStringType _wideStringType_)
    {
        setWideStringType(_wideStringType_);

    }
    public Object clone()
    {
        return new AWideParamTypeSpec(
            (PWideStringType) cloneNode(_wideStringType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWideParamTypeSpec(this);
    }

    public PWideStringType getWideStringType()
    {
        return _wideStringType_;
    }

    public void setWideStringType(PWideStringType node)
    {
        if(_wideStringType_ != null)
        {
            _wideStringType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _wideStringType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_wideStringType_);
    }

    void removeChild(Node child)
    {
        if(_wideStringType_ == child)
        {
            _wideStringType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_wideStringType_ == oldChild)
        {
            setWideStringType((PWideStringType) newChild);
            return;
        }

    }
}