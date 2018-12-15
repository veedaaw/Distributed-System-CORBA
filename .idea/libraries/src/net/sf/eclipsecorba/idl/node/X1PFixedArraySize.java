/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X1PFixedArraySize extends XPFixedArraySize
{
    private XPFixedArraySize _xPFixedArraySize_;
    private PFixedArraySize _pFixedArraySize_;

    public X1PFixedArraySize()
    {
    }

    public X1PFixedArraySize(
        XPFixedArraySize _xPFixedArraySize_,
        PFixedArraySize _pFixedArraySize_)
    {
        setXPFixedArraySize(_xPFixedArraySize_);
        setPFixedArraySize(_pFixedArraySize_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPFixedArraySize getXPFixedArraySize()
    {
        return _xPFixedArraySize_;
    }

    public void setXPFixedArraySize(XPFixedArraySize node)
    {
        if(_xPFixedArraySize_ != null)
        {
            _xPFixedArraySize_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPFixedArraySize_ = node;
    }

    public PFixedArraySize getPFixedArraySize()
    {
        return _pFixedArraySize_;
    }

    public void setPFixedArraySize(PFixedArraySize node)
    {
        if(_pFixedArraySize_ != null)
        {
            _pFixedArraySize_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pFixedArraySize_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPFixedArraySize_ == child)
        {
            _xPFixedArraySize_ = null;
        }

        if(_pFixedArraySize_ == child)
        {
            _pFixedArraySize_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPFixedArraySize_) +
            toString(_pFixedArraySize_);
    }
}