/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ABaseTypeSpecSimpleTypeSpec extends PSimpleTypeSpec
{
    private PBaseTypeSpec _baseTypeSpec_;

    public ABaseTypeSpecSimpleTypeSpec()
    {
    }

    public ABaseTypeSpecSimpleTypeSpec(
        PBaseTypeSpec _baseTypeSpec_)
    {
        setBaseTypeSpec(_baseTypeSpec_);

    }
    public Object clone()
    {
        return new ABaseTypeSpecSimpleTypeSpec(
            (PBaseTypeSpec) cloneNode(_baseTypeSpec_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABaseTypeSpecSimpleTypeSpec(this);
    }

    public PBaseTypeSpec getBaseTypeSpec()
    {
        return _baseTypeSpec_;
    }

    public void setBaseTypeSpec(PBaseTypeSpec node)
    {
        if(_baseTypeSpec_ != null)
        {
            _baseTypeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _baseTypeSpec_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_baseTypeSpec_);
    }

    void removeChild(Node child)
    {
        if(_baseTypeSpec_ == child)
        {
            _baseTypeSpec_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_baseTypeSpec_ == oldChild)
        {
            setBaseTypeSpec((PBaseTypeSpec) newChild);
            return;
        }

    }
}
