/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AFixedTemplateTypeSpec extends PTemplateTypeSpec
{
    private PFixedPtType _fixedPtType_;

    public AFixedTemplateTypeSpec()
    {
    }

    public AFixedTemplateTypeSpec(
        PFixedPtType _fixedPtType_)
    {
        setFixedPtType(_fixedPtType_);

    }
    public Object clone()
    {
        return new AFixedTemplateTypeSpec(
            (PFixedPtType) cloneNode(_fixedPtType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFixedTemplateTypeSpec(this);
    }

    public PFixedPtType getFixedPtType()
    {
        return _fixedPtType_;
    }

    public void setFixedPtType(PFixedPtType node)
    {
        if(_fixedPtType_ != null)
        {
            _fixedPtType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _fixedPtType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_fixedPtType_);
    }

    void removeChild(Node child)
    {
        if(_fixedPtType_ == child)
        {
            _fixedPtType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_fixedPtType_ == oldChild)
        {
            setFixedPtType((PFixedPtType) newChild);
            return;
        }

    }
}
