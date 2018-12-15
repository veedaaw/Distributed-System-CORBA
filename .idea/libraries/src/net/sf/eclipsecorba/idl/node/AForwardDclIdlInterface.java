/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AForwardDclIdlInterface extends PIdlInterface
{
    private PForwardDcl _forwardDcl_;

    public AForwardDclIdlInterface()
    {
    }

    public AForwardDclIdlInterface(
        PForwardDcl _forwardDcl_)
    {
        setForwardDcl(_forwardDcl_);

    }
    public Object clone()
    {
        return new AForwardDclIdlInterface(
            (PForwardDcl) cloneNode(_forwardDcl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForwardDclIdlInterface(this);
    }

    public PForwardDcl getForwardDcl()
    {
        return _forwardDcl_;
    }

    public void setForwardDcl(PForwardDcl node)
    {
        if(_forwardDcl_ != null)
        {
            _forwardDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _forwardDcl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_forwardDcl_);
    }

    void removeChild(Node child)
    {
        if(_forwardDcl_ == child)
        {
            _forwardDcl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_forwardDcl_ == oldChild)
        {
            setForwardDcl((PForwardDcl) newChild);
            return;
        }

    }
}