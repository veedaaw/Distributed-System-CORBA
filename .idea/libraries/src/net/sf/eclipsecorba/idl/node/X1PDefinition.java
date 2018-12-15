/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X1PDefinition extends XPDefinition
{
    private XPDefinition _xPDefinition_;
    private PDefinition _pDefinition_;

    public X1PDefinition()
    {
    }

    public X1PDefinition(
        XPDefinition _xPDefinition_,
        PDefinition _pDefinition_)
    {
        setXPDefinition(_xPDefinition_);
        setPDefinition(_pDefinition_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPDefinition getXPDefinition()
    {
        return _xPDefinition_;
    }

    public void setXPDefinition(XPDefinition node)
    {
        if(_xPDefinition_ != null)
        {
            _xPDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPDefinition_ = node;
    }

    public PDefinition getPDefinition()
    {
        return _pDefinition_;
    }

    public void setPDefinition(PDefinition node)
    {
        if(_pDefinition_ != null)
        {
            _pDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pDefinition_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPDefinition_ == child)
        {
            _xPDefinition_ = null;
        }

        if(_pDefinition_ == child)
        {
            _pDefinition_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPDefinition_) +
            toString(_pDefinition_);
    }
}
