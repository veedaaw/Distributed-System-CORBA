/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X2PCaseBody extends XPCaseBody
{
    private PCaseBody _pCaseBody_;

    public X2PCaseBody()
    {
    }

    public X2PCaseBody(
        PCaseBody _pCaseBody_)
    {
        setPCaseBody(_pCaseBody_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCaseBody getPCaseBody()
    {
        return _pCaseBody_;
    }

    public void setPCaseBody(PCaseBody node)
    {
        if(_pCaseBody_ != null)
        {
            _pCaseBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCaseBody_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCaseBody_ == child)
        {
            _pCaseBody_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCaseBody_);
    }
}
