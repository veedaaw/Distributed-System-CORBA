/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AValuebaseBaseTypeSpec extends PBaseTypeSpec
{
    private TValuebase _valuebase_;

    public AValuebaseBaseTypeSpec()
    {
    }

    public AValuebaseBaseTypeSpec(
        TValuebase _valuebase_)
    {
        setValuebase(_valuebase_);

    }
    public Object clone()
    {
        return new AValuebaseBaseTypeSpec(
            (TValuebase) cloneNode(_valuebase_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValuebaseBaseTypeSpec(this);
    }

    public TValuebase getValuebase()
    {
        return _valuebase_;
    }

    public void setValuebase(TValuebase node)
    {
        if(_valuebase_ != null)
        {
            _valuebase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _valuebase_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_valuebase_);
    }

    void removeChild(Node child)
    {
        if(_valuebase_ == child)
        {
            _valuebase_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_valuebase_ == oldChild)
        {
            setValuebase((TValuebase) newChild);
            return;
        }

    }
}