/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AInitParamDecls extends PInitParamDecls
{
    private PInitParamDecl _initParamDecl_;
    private final LinkedList _commaInitParamDecl_ = new TypedLinkedList(new CommaInitParamDecl_Cast());

    public AInitParamDecls()
    {
    }

    public AInitParamDecls(
        PInitParamDecl _initParamDecl_,
        List _commaInitParamDecl_)
    {
        setInitParamDecl(_initParamDecl_);

        {
            this._commaInitParamDecl_.clear();
            this._commaInitParamDecl_.addAll(_commaInitParamDecl_);
        }

    }

    public AInitParamDecls(
        PInitParamDecl _initParamDecl_,
        XPCommaInitParamDecl _commaInitParamDecl_)
    {
        setInitParamDecl(_initParamDecl_);

        if(_commaInitParamDecl_ != null)
        {
            while(_commaInitParamDecl_ instanceof X1PCommaInitParamDecl)
            {
                this._commaInitParamDecl_.addFirst(((X1PCommaInitParamDecl) _commaInitParamDecl_).getPCommaInitParamDecl());
                _commaInitParamDecl_ = ((X1PCommaInitParamDecl) _commaInitParamDecl_).getXPCommaInitParamDecl();
            }
            this._commaInitParamDecl_.addFirst(((X2PCommaInitParamDecl) _commaInitParamDecl_).getPCommaInitParamDecl());
        }

    }
    public Object clone()
    {
        return new AInitParamDecls(
            (PInitParamDecl) cloneNode(_initParamDecl_),
            cloneList(_commaInitParamDecl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInitParamDecls(this);
    }

    public PInitParamDecl getInitParamDecl()
    {
        return _initParamDecl_;
    }

    public void setInitParamDecl(PInitParamDecl node)
    {
        if(_initParamDecl_ != null)
        {
            _initParamDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _initParamDecl_ = node;
    }

    public LinkedList getCommaInitParamDecl()
    {
        return _commaInitParamDecl_;
    }

    public void setCommaInitParamDecl(List list)
    {
        _commaInitParamDecl_.clear();
        _commaInitParamDecl_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_initParamDecl_)
            + toString(_commaInitParamDecl_);
    }

    void removeChild(Node child)
    {
        if(_initParamDecl_ == child)
        {
            _initParamDecl_ = null;
            return;
        }

        if(_commaInitParamDecl_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_initParamDecl_ == oldChild)
        {
            setInitParamDecl((PInitParamDecl) newChild);
            return;
        }

        for(ListIterator i = _commaInitParamDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class CommaInitParamDecl_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaInitParamDecl node = (PCommaInitParamDecl) o;

            if((node.parent() != null) &&
                (node.parent() != AInitParamDecls.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AInitParamDecls.this))
            {
                node.parent(AInitParamDecls.this);
            }

            return node;
        }
    }
}
