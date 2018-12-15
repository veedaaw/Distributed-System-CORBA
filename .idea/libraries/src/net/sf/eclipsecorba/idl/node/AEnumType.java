/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AEnumType extends PEnumType
{
    private TEnum _enum_;
    private TIdentifier _name_;
    private TLBrace _lBrace_;
    private TIdentifier _identifier_;
    private final LinkedList _commaIdentifier_ = new TypedLinkedList(new CommaIdentifier_Cast());
    private TRBrace _rBrace_;

    public AEnumType()
    {
    }

    public AEnumType(
        TEnum _enum_,
        TIdentifier _name_,
        TLBrace _lBrace_,
        TIdentifier _identifier_,
        List _commaIdentifier_,
        TRBrace _rBrace_)
    {
        setEnum(_enum_);

        setName(_name_);

        setLBrace(_lBrace_);

        setIdentifier(_identifier_);

        {
            this._commaIdentifier_.clear();
            this._commaIdentifier_.addAll(_commaIdentifier_);
        }

        setRBrace(_rBrace_);

    }

    public AEnumType(
        TEnum _enum_,
        TIdentifier _name_,
        TLBrace _lBrace_,
        TIdentifier _identifier_,
        XPCommaIdentifier _commaIdentifier_,
        TRBrace _rBrace_)
    {
        setEnum(_enum_);

        setName(_name_);

        setLBrace(_lBrace_);

        setIdentifier(_identifier_);

        if(_commaIdentifier_ != null)
        {
            while(_commaIdentifier_ instanceof X1PCommaIdentifier)
            {
                this._commaIdentifier_.addFirst(((X1PCommaIdentifier) _commaIdentifier_).getPCommaIdentifier());
                _commaIdentifier_ = ((X1PCommaIdentifier) _commaIdentifier_).getXPCommaIdentifier();
            }
            this._commaIdentifier_.addFirst(((X2PCommaIdentifier) _commaIdentifier_).getPCommaIdentifier());
        }

        setRBrace(_rBrace_);

    }
    public Object clone()
    {
        return new AEnumType(
            (TEnum) cloneNode(_enum_),
            (TIdentifier) cloneNode(_name_),
            (TLBrace) cloneNode(_lBrace_),
            (TIdentifier) cloneNode(_identifier_),
            cloneList(_commaIdentifier_),
            (TRBrace) cloneNode(_rBrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumType(this);
    }

    public TEnum getEnum()
    {
        return _enum_;
    }

    public void setEnum(TEnum node)
    {
        if(_enum_ != null)
        {
            _enum_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _enum_ = node;
    }

    public TIdentifier getName()
    {
        return _name_;
    }

    public void setName(TIdentifier node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
    }

    public TLBrace getLBrace()
    {
        return _lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(_lBrace_ != null)
        {
            _lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBrace_ = node;
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

    public LinkedList getCommaIdentifier()
    {
        return _commaIdentifier_;
    }

    public void setCommaIdentifier(List list)
    {
        _commaIdentifier_.clear();
        _commaIdentifier_.addAll(list);
    }

    public TRBrace getRBrace()
    {
        return _rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(_rBrace_ != null)
        {
            _rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBrace_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_enum_)
            + toString(_name_)
            + toString(_lBrace_)
            + toString(_identifier_)
            + toString(_commaIdentifier_)
            + toString(_rBrace_);
    }

    void removeChild(Node child)
    {
        if(_enum_ == child)
        {
            _enum_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_lBrace_ == child)
        {
            _lBrace_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_commaIdentifier_.remove(child))
        {
            return;
        }

        if(_rBrace_ == child)
        {
            _rBrace_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_enum_ == oldChild)
        {
            setEnum((TEnum) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((TIdentifier) newChild);
            return;
        }

        if(_lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator i = _commaIdentifier_.listIterator(); i.hasNext();)
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

        if(_rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

    }

    private class CommaIdentifier_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaIdentifier node = (PCommaIdentifier) o;

            if((node.parent() != null) &&
                (node.parent() != AEnumType.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AEnumType.this))
            {
                node.parent(AEnumType.this);
            }

            return node;
        }
    }
}
