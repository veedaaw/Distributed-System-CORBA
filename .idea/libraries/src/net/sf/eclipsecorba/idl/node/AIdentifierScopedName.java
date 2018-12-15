/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AIdentifierScopedName extends PScopedName
{
    private TDoublecolon _doublecolon_;
    private TIdentifier _identifier_;

    public AIdentifierScopedName()
    {
    }

    public AIdentifierScopedName(
        TDoublecolon _doublecolon_,
        TIdentifier _identifier_)
    {
        setDoublecolon(_doublecolon_);

        setIdentifier(_identifier_);

    }
    public Object clone()
    {
        return new AIdentifierScopedName(
            (TDoublecolon) cloneNode(_doublecolon_),
            (TIdentifier) cloneNode(_identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierScopedName(this);
    }

    public TDoublecolon getDoublecolon()
    {
        return _doublecolon_;
    }

    public void setDoublecolon(TDoublecolon node)
    {
        if(_doublecolon_ != null)
        {
            _doublecolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _doublecolon_ = node;
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
            + toString(_doublecolon_)
            + toString(_identifier_);
    }

    void removeChild(Node child)
    {
        if(_doublecolon_ == child)
        {
            _doublecolon_ = null;
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
        if(_doublecolon_ == oldChild)
        {
            setDoublecolon((TDoublecolon) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

    }
}