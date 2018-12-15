/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AOpDclExport extends PExport
{
    private POpDcl _opDcl_;
    private TSemicolon _semicolon_;

    public AOpDclExport()
    {
    }

    public AOpDclExport(
        POpDcl _opDcl_,
        TSemicolon _semicolon_)
    {
        setOpDcl(_opDcl_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AOpDclExport(
            (POpDcl) cloneNode(_opDcl_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpDclExport(this);
    }

    public POpDcl getOpDcl()
    {
        return _opDcl_;
    }

    public void setOpDcl(POpDcl node)
    {
        if(_opDcl_ != null)
        {
            _opDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _opDcl_ = node;
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
            + toString(_opDcl_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_opDcl_ == child)
        {
            _opDcl_ = null;
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
        if(_opDcl_ == oldChild)
        {
            setOpDcl((POpDcl) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}