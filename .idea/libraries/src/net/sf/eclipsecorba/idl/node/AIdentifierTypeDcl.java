/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AIdentifierTypeDcl extends PTypeDcl
{
    private TNative _native_;
    private TIdentifier _identifier_;

    public AIdentifierTypeDcl()
    {
    }

    public AIdentifierTypeDcl(
        TNative _native_,
        TIdentifier _identifier_)
    {
        setNative(_native_);

        setIdentifier(_identifier_);

    }
    public Object clone()
    {
        return new AIdentifierTypeDcl(
            (TNative) cloneNode(_native_),
            (TIdentifier) cloneNode(_identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierTypeDcl(this);
    }

    public TNative getNative()
    {
        return _native_;
    }

    public void setNative(TNative node)
    {
        if(_native_ != null)
        {
            _native_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _native_ = node;
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
            + toString(_native_)
            + toString(_identifier_);
    }

    void removeChild(Node child)
    {
        if(_native_ == child)
        {
            _native_ = null;
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
        if(_native_ == oldChild)
        {
            setNative((TNative) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

    }
}