/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X1PCommaParamDcl extends XPCommaParamDcl
{
    private XPCommaParamDcl _xPCommaParamDcl_;
    private PCommaParamDcl _pCommaParamDcl_;

    public X1PCommaParamDcl()
    {
    }

    public X1PCommaParamDcl(
        XPCommaParamDcl _xPCommaParamDcl_,
        PCommaParamDcl _pCommaParamDcl_)
    {
        setXPCommaParamDcl(_xPCommaParamDcl_);
        setPCommaParamDcl(_pCommaParamDcl_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPCommaParamDcl getXPCommaParamDcl()
    {
        return _xPCommaParamDcl_;
    }

    public void setXPCommaParamDcl(XPCommaParamDcl node)
    {
        if(_xPCommaParamDcl_ != null)
        {
            _xPCommaParamDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPCommaParamDcl_ = node;
    }

    public PCommaParamDcl getPCommaParamDcl()
    {
        return _pCommaParamDcl_;
    }

    public void setPCommaParamDcl(PCommaParamDcl node)
    {
        if(_pCommaParamDcl_ != null)
        {
            _pCommaParamDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCommaParamDcl_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPCommaParamDcl_ == child)
        {
            _xPCommaParamDcl_ = null;
        }

        if(_pCommaParamDcl_ == child)
        {
            _pCommaParamDcl_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPCommaParamDcl_) +
            toString(_pCommaParamDcl_);
    }
}