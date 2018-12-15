/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AInitParamDecl extends PInitParamDecl
{
    private TIn _in_;
    private PParamTypeSpec _paramTypeSpec_;
    private TIdentifier _identifier_;

    public AInitParamDecl()
    {
    }

    public AInitParamDecl(
        TIn _in_,
        PParamTypeSpec _paramTypeSpec_,
        TIdentifier _identifier_)
    {
        setIn(_in_);

        setParamTypeSpec(_paramTypeSpec_);

        setIdentifier(_identifier_);

    }
    public Object clone()
    {
        return new AInitParamDecl(
            (TIn) cloneNode(_in_),
            (PParamTypeSpec) cloneNode(_paramTypeSpec_),
            (TIdentifier) cloneNode(_identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInitParamDecl(this);
    }

    public TIn getIn()
    {
        return _in_;
    }

    public void setIn(TIn node)
    {
        if(_in_ != null)
        {
            _in_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _in_ = node;
    }

    public PParamTypeSpec getParamTypeSpec()
    {
        return _paramTypeSpec_;
    }

    public void setParamTypeSpec(PParamTypeSpec node)
    {
        if(_paramTypeSpec_ != null)
        {
            _paramTypeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _paramTypeSpec_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return _identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(_identifier_ != null)
        {
            _identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _identifier_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_in_)
            + toString(_paramTypeSpec_)
            + toString(_identifier_);
    }

    void removeChild(Node child)
    {
        if(_in_ == child)
        {
            _in_ = null;
            return;
        }

        if(_paramTypeSpec_ == child)
        {
            _paramTypeSpec_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_in_ == oldChild)
        {
            setIn((TIn) newChild);
            return;
        }

        if(_paramTypeSpec_ == oldChild)
        {
            setParamTypeSpec((PParamTypeSpec) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

    }
}
