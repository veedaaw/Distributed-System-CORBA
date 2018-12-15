/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ACaseBody extends PCaseBody
{
    private final LinkedList _caseLabel_ = new TypedLinkedList(new CaseLabel_Cast());
    private PTypeSpec _typeSpec_;
    private PDeclarator _declarator_;
    private TSemicolon _semicolon_;

    public ACaseBody()
    {
    }

    public ACaseBody(
        List _caseLabel_,
        PTypeSpec _typeSpec_,
        PDeclarator _declarator_,
        TSemicolon _semicolon_)
    {
        {
            this._caseLabel_.clear();
            this._caseLabel_.addAll(_caseLabel_);
        }

        setTypeSpec(_typeSpec_);

        setDeclarator(_declarator_);

        setSemicolon(_semicolon_);

    }

    public ACaseBody(
        XPCaseLabel _caseLabel_,
        PTypeSpec _typeSpec_,
        PDeclarator _declarator_,
        TSemicolon _semicolon_)
    {
        if(_caseLabel_ != null)
        {
            while(_caseLabel_ instanceof X1PCaseLabel)
            {
                this._caseLabel_.addFirst(((X1PCaseLabel) _caseLabel_).getPCaseLabel());
                _caseLabel_ = ((X1PCaseLabel) _caseLabel_).getXPCaseLabel();
            }
            this._caseLabel_.addFirst(((X2PCaseLabel) _caseLabel_).getPCaseLabel());
        }

        setTypeSpec(_typeSpec_);

        setDeclarator(_declarator_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ACaseBody(
            cloneList(_caseLabel_),
            (PTypeSpec) cloneNode(_typeSpec_),
            (PDeclarator) cloneNode(_declarator_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaseBody(this);
    }

    public LinkedList getCaseLabel()
    {
        return _caseLabel_;
    }

    public void setCaseLabel(List list)
    {
        _caseLabel_.clear();
        _caseLabel_.addAll(list);
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

    public PDeclarator getDeclarator()
    {
        return _declarator_;
    }

    public void setDeclarator(PDeclarator node)
    {
        if(_declarator_ != null)
        {
            _declarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _declarator_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_caseLabel_)
            + toString(_typeSpec_)
            + toString(_declarator_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_caseLabel_.remove(child))
        {
            return;
        }

        if(_typeSpec_ == child)
        {
            _typeSpec_ = null;
            return;
        }

        if(_declarator_ == child)
        {
            _declarator_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _caseLabel_.listIterator(); i.hasNext();)
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

        if(_typeSpec_ == oldChild)
        {
            setTypeSpec((PTypeSpec) newChild);
            return;
        }

        if(_declarator_ == oldChild)
        {
            setDeclarator((PDeclarator) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }

    private class CaseLabel_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCaseLabel node = (PCaseLabel) o;

            if((node.parent() != null) &&
                (node.parent() != ACaseBody.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != ACaseBody.this))
            {
                node.parent(ACaseBody.this);
            }

            return node;
        }
    }
}