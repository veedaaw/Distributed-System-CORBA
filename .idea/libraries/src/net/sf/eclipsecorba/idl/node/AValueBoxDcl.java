/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AValueBoxDcl extends PValueBoxDcl
{
    private TValuetype _valuetype_;
    private TIdentifier _identifier_;
    private PTypeSpec _typeSpec_;

    public AValueBoxDcl()
    {
    }

    public AValueBoxDcl(
        TValuetype _valuetype_,
        TIdentifier _identifier_,
        PTypeSpec _typeSpec_)
    {
        setValuetype(_valuetype_);

        setIdentifier(_identifier_);

        setTypeSpec(_typeSpec_);

    }
    public Object clone()
    {
        return new AValueBoxDcl(
            (TValuetype) cloneNode(_valuetype_),
            (TIdentifier) cloneNode(_identifier_),
            (PTypeSpec) cloneNode(_typeSpec_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValueBoxDcl(this);
    }

    public TValuetype getValuetype()
    {
        return _valuetype_;
    }

    public void setValuetype(TValuetype node)
    {
        if(_valuetype_ != null)
        {
            _valuetype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _valuetype_ = node;
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

    public PTypeSpec getTypeSpec()
    {
        return _typeSpec_;
    }

    public void setTypeSpec(PTypeSpec node)
    {
        if(_typeSpec_ != null)
        {
            _typeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typeSpec_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_valuetype_)
            + toString(_identifier_)
            + toString(_typeSpec_);
    }

    void removeChild(Node child)
    {
        if(_valuetype_ == child)
        {
            _valuetype_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_typeSpec_ == child)
        {
            _typeSpec_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_valuetype_ == oldChild)
        {
            setValuetype((TValuetype) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(_typeSpec_ == oldChild)
        {
            setTypeSpec((PTypeSpec) newChild);
            return;
        }

    }
}
