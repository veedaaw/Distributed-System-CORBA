/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AConstrTypeSpecTypeSpec extends PTypeSpec
{
    private PConstrTypeSpec _constrTypeSpec_;

    public AConstrTypeSpecTypeSpec()
    {
    }

    public AConstrTypeSpecTypeSpec(
        PConstrTypeSpec _constrTypeSpec_)
    {
        setConstrTypeSpec(_constrTypeSpec_);

    }
    public Object clone()
    {
        return new AConstrTypeSpecTypeSpec(
            (PConstrTypeSpec) cloneNode(_constrTypeSpec_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstrTypeSpecTypeSpec(this);
    }

    public PConstrTypeSpec getConstrTypeSpec()
    {
        return _constrTypeSpec_;
    }

    public void setConstrTypeSpec(PConstrTypeSpec node)
    {
        if(_constrTypeSpec_ != null)
        {
            _constrTypeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _constrTypeSpec_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_constrTypeSpec_);
    }

    void removeChild(Node child)
    {
        if(_constrTypeSpec_ == child)
        {
            _constrTypeSpec_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_constrTypeSpec_ == oldChild)
        {
            setConstrTypeSpec((PConstrTypeSpec) newChild);
            return;
        }

    }
}
