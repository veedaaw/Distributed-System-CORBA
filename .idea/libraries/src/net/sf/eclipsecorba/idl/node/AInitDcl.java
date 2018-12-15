/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AInitDcl extends PInitDcl
{
    private TFactory _factory_;
    private TIdentifier _identifier_;
    private TLParenthese _lParenthese_;
    private PInitParamDecls _initParamDecls_;
    private TRParenthese _rParenthese_;
    private TSemicolon _semicolon_;

    public AInitDcl()
    {
    }

    public AInitDcl(
        TFactory _factory_,
        TIdentifier _identifier_,
        TLParenthese _lParenthese_,
        PInitParamDecls _initParamDecls_,
        TRParenthese _rParenthese_,
        TSemicolon _semicolon_)
    {
        setFactory(_factory_);

        setIdentifier(_identifier_);

        setLParenthese(_lParenthese_);

        setInitParamDecls(_initParamDecls_);

        setRParenthese(_rParenthese_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AInitDcl(
            (TFactory) cloneNode(_factory_),
            (TIdentifier) cloneNode(_identifier_),
            (TLParenthese) cloneNode(_lParenthese_),
            (PInitParamDecls) cloneNode(_initParamDecls_),
            (TRParenthese) cloneNode(_rParenthese_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInitDcl(this);
    }

    public TFactory getFactory()
    {
        return _factory_;
    }

    public void setFactory(TFactory node)
    {
        if(_factory_ != null)
        {
            _factory_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _factory_ = node;
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

    public TLParenthese getLParenthese()
    {
        return _lParenthese_;
    }

    public void setLParenthese(TLParenthese node)
    {
        if(_lParenthese_ != null)
        {
            _lParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lParenthese_ = node;
    }

    public PInitParamDecls getInitParamDecls()
    {
        return _initParamDecls_;
    }

    public void setInitParamDecls(PInitParamDecls node)
    {
        if(_initParamDecls_ != null)
        {
            _initParamDecls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _initParamDecls_ = node;
    }

    public TRParenthese getRParenthese()
    {
        return _rParenthese_;
    }

    public void setRParenthese(TRParenthese node)
    {
        if(_rParenthese_ != null)
        {
            _rParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rParenthese_ = node;
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
            + toString(_factory_)
            + toString(_identifier_)
            + toString(_lParenthese_)
            + toString(_initParamDecls_)
            + toString(_rParenthese_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_factory_ == child)
        {
            _factory_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_lParenthese_ == child)
        {
            _lParenthese_ = null;
            return;
        }

        if(_initParamDecls_ == child)
        {
            _initParamDecls_ = null;
            return;
        }

        if(_rParenthese_ == child)
        {
            _rParenthese_ = null;
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
        if(_factory_ == oldChild)
        {
            setFactory((TFactory) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(_lParenthese_ == oldChild)
        {
            setLParenthese((TLParenthese) newChild);
            return;
        }

        if(_initParamDecls_ == oldChild)
        {
            setInitParamDecls((PInitParamDecls) newChild);
            return;
        }

        if(_rParenthese_ == oldChild)
        {
            setRParenthese((TRParenthese) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}