/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AOpDcl extends POpDcl
{
    private TOneway _oneway_;
    private POpTypeSpec _opTypeSpec_;
    private TIdentifier _identifier_;
    private PParameterDcls _parameterDcls_;
    private PRaisesExpr _raisesExpr_;
    private PContextExpr _contextExpr_;

    public AOpDcl()
    {
    }

    public AOpDcl(
        TOneway _oneway_,
        POpTypeSpec _opTypeSpec_,
        TIdentifier _identifier_,
        PParameterDcls _parameterDcls_,
        PRaisesExpr _raisesExpr_,
        PContextExpr _contextExpr_)
    {
        setOneway(_oneway_);

        setOpTypeSpec(_opTypeSpec_);

        setIdentifier(_identifier_);

        setParameterDcls(_parameterDcls_);

        setRaisesExpr(_raisesExpr_);

        setContextExpr(_contextExpr_);

    }
    public Object clone()
    {
        return new AOpDcl(
            (TOneway) cloneNode(_oneway_),
            (POpTypeSpec) cloneNode(_opTypeSpec_),
            (TIdentifier) cloneNode(_identifier_),
            (PParameterDcls) cloneNode(_parameterDcls_),
            (PRaisesExpr) cloneNode(_raisesExpr_),
            (PContextExpr) cloneNode(_contextExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpDcl(this);
    }

    public TOneway getOneway()
    {
        return _oneway_;
    }

    public void setOneway(TOneway node)
    {
        if(_oneway_ != null)
        {
            _oneway_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _oneway_ = node;
    }

    public POpTypeSpec getOpTypeSpec()
    {
        return _opTypeSpec_;
    }

    public void setOpTypeSpec(POpTypeSpec node)
    {
        if(_opTypeSpec_ != null)
        {
            _opTypeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _opTypeSpec_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return _identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(_identifier_ != null)
        {
            _identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _identifier_ = node;
    }

    public PParameterDcls getParameterDcls()
    {
        return _parameterDcls_;
    }

    public void setParameterDcls(PParameterDcls node)
    {
        if(_parameterDcls_ != null)
        {
            _parameterDcls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parameterDcls_ = node;
    }

    public PRaisesExpr getRaisesExpr()
    {
        return _raisesExpr_;
    }

    public void setRaisesExpr(PRaisesExpr node)
    {
        if(_raisesExpr_ != null)
        {
            _raisesExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _raisesExpr_ = node;
    }

    public PContextExpr getContextExpr()
    {
        return _contextExpr_;
    }

    public void setContextExpr(PContextExpr node)
    {
        if(_contextExpr_ != null)
        {
            _contextExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _contextExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_oneway_)
            + toString(_opTypeSpec_)
            + toString(_identifier_)
            + toString(_parameterDcls_)
            + toString(_raisesExpr_)
            + toString(_contextExpr_);
    }

    void removeChild(Node child)
    {
        if(_oneway_ == child)
        {
            _oneway_ = null;
            return;
        }

        if(_opTypeSpec_ == child)
        {
            _opTypeSpec_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_parameterDcls_ == child)
        {
            _parameterDcls_ = null;
            return;
        }

        if(_raisesExpr_ == child)
        {
            _raisesExpr_ = null;
            return;
        }

        if(_contextExpr_ == child)
        {
            _contextExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_oneway_ == oldChild)
        {
            setOneway((TOneway) newChild);
            return;
        }

        if(_opTypeSpec_ == oldChild)
        {
            setOpTypeSpec((POpTypeSpec) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(_parameterDcls_ == oldChild)
        {
            setParameterDcls((PParameterDcls) newChild);
            return;
        }

        if(_raisesExpr_ == oldChild)
        {
            setRaisesExpr((PRaisesExpr) newChild);
            return;
        }

        if(_contextExpr_ == oldChild)
        {
            setContextExpr((PContextExpr) newChild);
            return;
        }

    }
}
