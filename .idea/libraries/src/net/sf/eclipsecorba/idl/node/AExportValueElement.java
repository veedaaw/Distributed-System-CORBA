/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.eclipsecorba.idl.node;

import java.util.*;
import net.sf.eclipsecorba.idl.analysis.*;

public final class AExportValueElement extends PValueElement
{
    private PExport _export_;

    public AExportValueElement()
    {
    }

    public AExportValueElement(
        PExport _export_)
    {
        setExport(_export_);

    }
    public Object clone()
    {
        return new AExportValueElement(
            (PExport) cloneNode(_export_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExportValueElement(this);
    }

    public PExport getExport()
    {
        return _export_;
    }

    public void setExport(PExport node)
    {
        if(_export_ != null)
        {
            _export_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _export_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_export_);
    }

    void removeChild(Node child)
    {
        if(_export_ == child)
        {
            _export_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_export_ == oldChild)
        {
            setExport((PExport) newChild);
            return;
        }

    }
}
