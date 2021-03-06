/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ATypeDclExport extends PExport
{
    private PTypeDcl _typeDcl_;
    private TSemicolon _semicolon_;

    public ATypeDclExport()
    {
    }

    public ATypeDclExport(
        PTypeDcl _typeDcl_,
        TSemicolon _semicolon_)
    {
        setTypeDcl(_typeDcl_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ATypeDclExport(
            (PTypeDcl) cloneNode(_typeDcl_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeDclExport(this);
    }

    public PTypeDcl getTypeDcl()
    {
        return _typeDcl_;
    }

    public void setTypeDcl(PTypeDcl node)
    {
        if(_typeDcl_ != null)
        {
            _typeDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typeDcl_ = node;
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
            + toString(_typeDcl_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_typeDcl_ == child)
        {
            _typeDcl_ = null;
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
        if(_typeDcl_ == oldChild)
        {
            setTypeDcl((PTypeDcl) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
