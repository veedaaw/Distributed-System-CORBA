/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ATypePrefixDefinition extends PDefinition
{
    private PTypePrefix _typePrefix_;
    private TSemicolon _semicolon_;

    public ATypePrefixDefinition()
    {
    }

    public ATypePrefixDefinition(
        PTypePrefix _typePrefix_,
        TSemicolon _semicolon_)
    {
        setTypePrefix(_typePrefix_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ATypePrefixDefinition(
            (PTypePrefix) cloneNode(_typePrefix_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypePrefixDefinition(this);
    }

    public PTypePrefix getTypePrefix()
    {
        return _typePrefix_;
    }

    public void setTypePrefix(PTypePrefix node)
    {
        if(_typePrefix_ != null)
        {
            _typePrefix_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typePrefix_ = node;
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
            + toString(_typePrefix_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_typePrefix_ == child)
        {
            _typePrefix_ = null;
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
        if(_typePrefix_ == oldChild)
        {
            setTypePrefix((PTypePrefix) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
