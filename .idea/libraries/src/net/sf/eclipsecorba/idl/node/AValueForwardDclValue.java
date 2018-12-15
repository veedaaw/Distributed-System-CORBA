/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AValueForwardDclValue extends PValue
{
    private PValueForwardDcl _valueForwardDcl_;

    public AValueForwardDclValue()
    {
    }

    public AValueForwardDclValue(
        PValueForwardDcl _valueForwardDcl_)
    {
        setValueForwardDcl(_valueForwardDcl_);

    }
    public Object clone()
    {
        return new AValueForwardDclValue(
            (PValueForwardDcl) cloneNode(_valueForwardDcl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValueForwardDclValue(this);
    }

    public PValueForwardDcl getValueForwardDcl()
    {
        return _valueForwardDcl_;
    }

    public void setValueForwardDcl(PValueForwardDcl node)
    {
        if(_valueForwardDcl_ != null)
        {
            _valueForwardDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _valueForwardDcl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_valueForwardDcl_);
    }

    void removeChild(Node child)
    {
        if(_valueForwardDcl_ == child)
        {
            _valueForwardDcl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_valueForwardDcl_ == oldChild)
        {
            setValueForwardDcl((PValueForwardDcl) newChild);
            return;
        }

    }
}