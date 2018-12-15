/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import net.sf.eclipsecorba.idl.analysis.*;

public final class X2PCaseLabel extends XPCaseLabel
{
    private PCaseLabel _pCaseLabel_;

    public X2PCaseLabel()
    {
    }

    public X2PCaseLabel(
        PCaseLabel _pCaseLabel_)
    {
        setPCaseLabel(_pCaseLabel_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCaseLabel getPCaseLabel()
    {
        return _pCaseLabel_;
    }

    public void setPCaseLabel(PCaseLabel node)
    {
        if(_pCaseLabel_ != null)
        {
            _pCaseLabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCaseLabel_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCaseLabel_ == child)
        {
            _pCaseLabel_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCaseLabel_);
    }
}
