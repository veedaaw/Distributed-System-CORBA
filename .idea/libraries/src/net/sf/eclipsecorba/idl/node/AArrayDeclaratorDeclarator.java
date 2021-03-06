/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AArrayDeclaratorDeclarator extends PDeclarator
{
    private PArrayDeclarator _arrayDeclarator_;

    public AArrayDeclaratorDeclarator()
    {
    }

    public AArrayDeclaratorDeclarator(
        PArrayDeclarator _arrayDeclarator_)
    {
        setArrayDeclarator(_arrayDeclarator_);

    }
    public Object clone()
    {
        return new AArrayDeclaratorDeclarator(
            (PArrayDeclarator) cloneNode(_arrayDeclarator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayDeclaratorDeclarator(this);
    }

    public PArrayDeclarator getArrayDeclarator()
    {
        return _arrayDeclarator_;
    }

    public void setArrayDeclarator(PArrayDeclarator node)
    {
        if(_arrayDeclarator_ != null)
        {
            _arrayDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _arrayDeclarator_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_arrayDeclarator_);
    }

    void removeChild(Node child)
    {
        if(_arrayDeclarator_ == child)
        {
            _arrayDeclarator_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_arrayDeclarator_ == oldChild)
        {
            setArrayDeclarator((PArrayDeclarator) newChild);
            return;
        }

    }
}
