/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ASpecification extends PSpecification
{
    private final LinkedList _definition_ = new TypedLinkedList(new Definition_Cast());

    public ASpecification()
    {
    }

    public ASpecification(
        List _definition_)
    {
        {
            this._definition_.clear();
            this._definition_.addAll(_definition_);
        }

    }

    public ASpecification(
        XPDefinition _definition_)
    {
        if(_definition_ != null)
        {
            while(_definition_ instanceof X1PDefinition)
            {
                this._definition_.addFirst(((X1PDefinition) _definition_).getPDefinition());
                _definition_ = ((X1PDefinition) _definition_).getXPDefinition();
            }
            this._definition_.addFirst(((X2PDefinition) _definition_).getPDefinition());
        }

    }
    public Object clone()
    {
        return new ASpecification(
            cloneList(_definition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASpecification(this);
    }

    public LinkedList getDefinition()
    {
        return _definition_;
    }

    public void setDefinition(List list)
    {
        _definition_.clear();
        _definition_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_definition_);
    }

    void removeChild(Node child)
    {
        if(_definition_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _definition_.listIterator(); i.hasNext();)
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

    private class Definition_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PDefinition node = (PDefinition) o;

            if((node.parent() != null) &&
                (node.parent() != ASpecification.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != ASpecification.this))
            {
                node.parent(ASpecification.this);
            }

            return node;
        }
    }
}
