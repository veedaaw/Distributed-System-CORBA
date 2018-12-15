/**
 Copyright (C) 2007  ECP Project

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

 CHANGELOG:
 Created on 19 Jan 2007
 */
package net.sf.eclipsecorba.idl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.IDocument;

/**
 * Interface used to separate Eclipse code from parser
 * @author Michael Houston
 */
public interface InputFile {

	public abstract void addErrorMarker(int line, int pos, int length,
			String message);

	public abstract void addErrorMarker(int line, int pos, int length,
			String message, int severity);

	/**
	 * 
	 * @return a list of IDLFile objects corresponding to the includes in this
	 *         file
	 */
	public abstract List getIncludes();

	public abstract String getFileName();

	/**
	 * Returns the definitions map for this file
	 * 
	 * @return
	 */
	public Map getMacros();

	public HashMap getComments();

	public Specification getModel();

	public String getDefinition(String key);

	public HashMap getNames();

	public IDocument getDocument();

	public abstract void setModified(long modificationStamp);

	public abstract long getModified();

	public String getDefinition(String key, List searched);

}