/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X2PCommaStringLiteral extends XPCommaStringLiteral
{
    private PCommaStringLiteral _pCommaStringLiteral_;

    public X2PCommaStringLiteral()
    {
    }

    public X2PCommaStringLiteral(
        PCommaStringLiteral _pCommaStringLiteral_)
    {
        setPCommaStringLiteral(_pCommaStringLiteral_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCommaStringLiteral getPCommaStringLiteral()
    {
        return _pCommaStringLiteral_;
    }

    public void setPCommaStringLiteral(PCommaStringLiteral node)
    {
        if(_pCommaStringLiteral_ != null)
        {
            _pCommaStringLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCommaStringLiteral_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCommaStringLiteral_ == child)
        {
            _pCommaStringLiteral_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCommaStringLiteral_);
    }
}
