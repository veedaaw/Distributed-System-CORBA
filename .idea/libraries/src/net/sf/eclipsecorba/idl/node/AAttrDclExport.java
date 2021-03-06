/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AAttrDclExport extends PExport
{
    private PAttrDcl _attrDcl_;
    private TSemicolon _semicolon_;

    public AAttrDclExport()
    {
    }

    public AAttrDclExport(
        PAttrDcl _attrDcl_,
        TSemicolon _semicolon_)
    {
        setAttrDcl(_attrDcl_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AAttrDclExport(
            (PAttrDcl) cloneNode(_attrDcl_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAttrDclExport(this);
    }

    public PAttrDcl getAttrDcl()
    {
        return _attrDcl_;
    }

    public void setAttrDcl(PAttrDcl node)
    {
        if(_attrDcl_ != null)
        {
            _attrDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _attrDcl_ = node;
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
            + toString(_attrDcl_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_attrDcl_ == child)
        {
            _attrDcl_ = null;
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
        if(_attrDcl_ == oldChild)
        {
            setAttrDcl((PAttrDcl) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
