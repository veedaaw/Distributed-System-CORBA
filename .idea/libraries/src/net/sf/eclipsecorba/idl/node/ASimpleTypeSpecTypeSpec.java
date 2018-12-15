/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ASimpleTypeSpecTypeSpec extends PTypeSpec
{
    private PSimpleTypeSpec _simpleTypeSpec_;

    public ASimpleTypeSpecTypeSpec()
    {
    }

    public ASimpleTypeSpecTypeSpec(
        PSimpleTypeSpec _simpleTypeSpec_)
    {
        setSimpleTypeSpec(_simpleTypeSpec_);

    }
    public Object clone()
    {
        return new ASimpleTypeSpecTypeSpec(
            (PSimpleTypeSpec) cloneNode(_simpleTypeSpec_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleTypeSpecTypeSpec(this);
    }

    public PSimpleTypeSpec getSimpleTypeSpec()
    {
        return _simpleTypeSpec_;
    }

    public void setSimpleTypeSpec(PSimpleTypeSpec node)
    {
        if(_simpleTypeSpec_ != null)
        {
            _simpleTypeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _simpleTypeSpec_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_simpleTypeSpec_);
    }

    void removeChild(Node child)
    {
        if(_simpleTypeSpec_ == child)
        {
            _simpleTypeSpec_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_simpleTypeSpec_ == oldChild)
        {
            setSimpleTypeSpec((PSimpleTypeSpec) newChild);
            return;
        }

    }
}