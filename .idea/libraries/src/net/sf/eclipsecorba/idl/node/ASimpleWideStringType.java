/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ASimpleWideStringType extends PWideStringType
{
    private TWstring _wstring_;

    public ASimpleWideStringType()
    {
    }

    public ASimpleWideStringType(
        TWstring _wstring_)
    {
        setWstring(_wstring_);

    }
    public Object clone()
    {
        return new ASimpleWideStringType(
            (TWstring) cloneNode(_wstring_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleWideStringType(this);
    }

    public TWstring getWstring()
    {
        return _wstring_;
    }

    public void setWstring(TWstring node)
    {
        if(_wstring_ != null)
        {
            _wstring_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _wstring_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_wstring_);
    }

    void removeChild(Node child)
    {
        if(_wstring_ == child)
        {
            _wstring_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_wstring_ == oldChild)
        {
            setWstring((TWstring) newChild);
            return;
        }

    }
}
