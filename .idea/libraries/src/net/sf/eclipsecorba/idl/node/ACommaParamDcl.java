/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ACommaParamDcl extends PCommaParamDcl
{
    private TComma _comma_;
    private PParamDcl _paramDcl_;

    public ACommaParamDcl()
    {
    }

    public ACommaParamDcl(
        TComma _comma_,
        PParamDcl _paramDcl_)
    {
        setComma(_comma_);

        setParamDcl(_paramDcl_);

    }
    public Object clone()
    {
        return new ACommaParamDcl(
            (TComma) cloneNode(_comma_),
            (PParamDcl) cloneNode(_paramDcl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommaParamDcl(this);
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if(_comma_ != null)
        {
            _comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public PParamDcl getParamDcl()
    {
        return _paramDcl_;
    }

    public void setParamDcl(PParamDcl node)
    {
        if(_paramDcl_ != null)
        {
            _paramDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _paramDcl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comma_)
            + toString(_paramDcl_);
    }

    void removeChild(Node child)
    {
        if(_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if(_paramDcl_ == child)
        {
            _paramDcl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(_paramDcl_ == oldChild)
        {
            setParamDcl((PParamDcl) newChild);
            return;
        }

    }
}
