/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AContextExpr extends PContextExpr
{
    private TContext _context_;
    private TLParenthese _lParenthese_;
    private TStringLiteral _stringLiteral_;
    private final LinkedList _commaStringLiteral_ = new TypedLinkedList(new CommaStringLiteral_Cast());
    private TRParenthese _rParenthese_;

    public AContextExpr()
    {
    }

    public AContextExpr(
        TContext _context_,
        TLParenthese _lParenthese_,
        TStringLiteral _stringLiteral_,
        List _commaStringLiteral_,
        TRParenthese _rParenthese_)
    {
        setContext(_context_);

        setLParenthese(_lParenthese_);

        setStringLiteral(_stringLiteral_);

        {
            this._commaStringLiteral_.clear();
            this._commaStringLiteral_.addAll(_commaStringLiteral_);
        }

        setRParenthese(_rParenthese_);

    }

    public AContextExpr(
        TContext _context_,
        TLParenthese _lParenthese_,
        TStringLiteral _stringLiteral_,
        XPCommaStringLiteral _commaStringLiteral_,
        TRParenthese _rParenthese_)
    {
        setContext(_context_);

        setLParenthese(_lParenthese_);

        setStringLiteral(_stringLiteral_);

        if(_commaStringLiteral_ != null)
        {
            while(_commaStringLiteral_ instanceof X1PCommaStringLiteral)
            {
                this._commaStringLiteral_.addFirst(((X1PCommaStringLiteral) _commaStringLiteral_).getPCommaStringLiteral());
                _commaStringLiteral_ = ((X1PCommaStringLiteral) _commaStringLiteral_).getXPCommaStringLiteral();
            }
            this._commaStringLiteral_.addFirst(((X2PCommaStringLiteral) _commaStringLiteral_).getPCommaStringLiteral());
        }

        setRParenthese(_rParenthese_);

    }
    public Object clone()
    {
        return new AContextExpr(
            (TContext) cloneNode(_context_),
            (TLParenthese) cloneNode(_lParenthese_),
            (TStringLiteral) cloneNode(_stringLiteral_),
            cloneList(_commaStringLiteral_),
            (TRParenthese) cloneNode(_rParenthese_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAContextExpr(this);
    }

    public TContext getContext()
    {
        return _context_;
    }

    public void setContext(TContext node)
    {
        if(_context_ != null)
        {
            _context_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _context_ = node;
    }

    public TLParenthese getLParenthese()
    {
        return _lParenthese_;
    }

    public void setLParenthese(TLParenthese node)
    {
        if(_lParenthese_ != null)
        {
            _lParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lParenthese_ = node;
    }

    public TStringLiteral getStringLiteral()
    {
        return _stringLiteral_;
    }

    public void setStringLiteral(TStringLiteral node)
    {
        if(_stringLiteral_ != null)
        {
            _stringLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stringLiteral_ = node;
    }

    public LinkedList getCommaStringLiteral()
    {
        return _commaStringLiteral_;
    }

    public void setCommaStringLiteral(List list)
    {
        _commaStringLiteral_.clear();
        _commaStringLiteral_.addAll(list);
    }

    public TRParenthese getRParenthese()
    {
        return _rParenthese_;
    }

    public void setRParenthese(TRParenthese node)
    {
        if(_rParenthese_ != null)
        {
            _rParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rParenthese_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_context_)
            + toString(_lParenthese_)
            + toString(_stringLiteral_)
            + toString(_commaStringLiteral_)
            + toString(_rParenthese_);
    }

    void removeChild(Node child)
    {
        if(_context_ == child)
        {
            _context_ = null;
            return;
        }

        if(_lParenthese_ == child)
        {
            _lParenthese_ = null;
            return;
        }

        if(_stringLiteral_ == child)
        {
            _stringLiteral_ = null;
            return;
        }

        if(_commaStringLiteral_.remove(child))
        {
            return;
        }

        if(_rParenthese_ == child)
        {
            _rParenthese_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_context_ == oldChild)
        {
            setContext((TContext) newChild);
            return;
        }

        if(_lParenthese_ == oldChild)
        {
            setLParenthese((TLParenthese) newChild);
            return;
        }

        if(_stringLiteral_ == oldChild)
        {
            setStringLiteral((TStringLiteral) newChild);
            return;
        }

        for(ListIterator i = _commaStringLiteral_.listIterator(); i.hasNext();)
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

        if(_rParenthese_ == oldChild)
        {
            setRParenthese((TRParenthese) newChild);
            return;
        }

    }

    private class CommaStringLiteral_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaStringLiteral node = (PCommaStringLiteral) o;

            if((node.parent() != null) &&
                (node.parent() != AContextExpr.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AContextExpr.this))
            {
                node.parent(AContextExpr.this);
            }

            return node;
        }
    }
}
