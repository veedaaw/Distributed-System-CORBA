/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class ALonglongConstType extends PConstType
{
    private PSignedLonglongInt _signedLonglongInt_;

    public ALonglongConstType()
    {
    }

    public ALonglongConstType(
        PSignedLonglongInt _signedLonglongInt_)
    {
        setSignedLonglongInt(_signedLonglongInt_);

    }
    public Object clone()
    {
        return new ALonglongConstType(
            (PSignedLonglongInt) cloneNode(_signedLonglongInt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALonglongConstType(this);
    }

    public PSignedLonglongInt getSignedLonglongInt()
    {
        return _signedLonglongInt_;
    }

    public void setSignedLonglongInt(PSignedLonglongInt node)
    {
        if(_signedLonglongInt_ != null)
        {
            _signedLonglongInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _signedLonglongInt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_signedLonglongInt_);
    }

    void removeChild(Node child)
    {
        if(_signedLonglongInt_ == child)
        {
            _signedLonglongInt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_signedLonglongInt_ == oldChild)
        {
            setSignedLonglongInt((PSignedLonglongInt) newChild);
            return;
        }

    }
}
