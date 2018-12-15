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
 Created on Nov 18, 2007
 */
package net.sf.eclipsecorba.idl;

import net.sf.eclipsecorba.idl.node.Node;

public class IDLSyntaxError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7306693855988086461L;
	
	private final Node node;

	public IDLSyntaxError(Node node, String message) {
		super(message);
		this.node = node;
	}

	public Node getNode() {
		return node;
	}

}
