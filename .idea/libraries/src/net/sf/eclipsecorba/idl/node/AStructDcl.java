/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AStructDcl extends PStructDcl
{
    private TStruct _struct_;
    private TIdentifier _identifier_;
    private TLBrace _lBrace_;
    private final LinkedList _member_ = new TypedLinkedList(new Member_Cast());
    private TRBrace _rBrace_;

    public AStructDcl()
    {
    }

    public AStructDcl(
        TStruct _struct_,
        TIdentifier _identifier_,
        TLBrace _lBrace_,
        List _member_,
        TRBrace _rBrace_)
    {
        setStruct(_struct_);

        setIdentifier(_identifier_);

        setLBrace(_lBrace_);

        {
            this._member_.clear();
            this._member_.addAll(_member_);
        }

        setRBrace(_rBrace_);

    }

    public AStructDcl(
        TStruct _struct_,
        TIdentifier _identifier_,
        TLBrace _lBrace_,
        XPMember _member_,
        TRBrace _rBrace_)
    {
        setStruct(_struct_);

        setIdentifier(_identifier_);

        setLBrace(_lBrace_);

        if(_member_ != null)
        {
            while(_member_ instanceof X1PMember)
            {
                this._member_.addFirst(((X1PMember) _member_).getPMember());
                _member_ = ((X1PMember) _member_).getXPMember();
            }
            this._member_.addFirst(((X2PMember) _member_).getPMember());
        }

        setRBrace(_rBrace_);

    }
    public Object clone()
    {
        return new AStructDcl(
            (TStruct) cloneNode(_struct_),
            (TIdentifier) cloneNode(_identifier_),
            (TLBrace) cloneNode(_lBrace_),
            cloneList(_member_),
            (TRBrace) cloneNode(_rBrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStructDcl(this);
    }

    public TStruct getStruct()
    {
        return _struct_;
    }

    public void setStruct(TStruct node)
    {
        if(_struct_ != null)
        {
            _struct_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _struct_ = node;
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

    public LinkedList getMember()
    {
        return _member_;
    }

    public void setMember(List list)
    {
        _member_.clear();
        _member_.addAll(list);
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
            + toString(_struct_)
            + toString(_identifier_)
            + toString(_lBrace_)
            + toString(_member_)
            + toString(_rBrace_);
    }

    void removeChild(Node child)
    {
        if(_struct_ == child)
        {
            _struct_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_lBrace_ == child)
        {
            _lBrace_ = null;
            return;
        }

        if(_member_.remove(child))
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
        if(_struct_ == oldChild)
        {
            setStruct((TStruct) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(_lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        for(ListIterator i = _member_.listIterator(); i.hasNext();)
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

    private class Member_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PMember node = (PMember) o;

            if((node.parent() != null) &&
                (node.parent() != AStructDcl.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AStructDcl.this))
            {
                node.parent(AStructDcl.this);
            }

            return node;
        }
    }
}
