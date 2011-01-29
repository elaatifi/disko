/*******************************************************************************
 * Copyright (c) 2005, Kobrix Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Borislav Iordanov - initial API and implementation
 *     Murilo Saraiva de Queiroz - initial API and implementation
 ******************************************************************************/
package disko.data.relex;

public class RelationInfo {
	private float count;

	public RelationInfo(){
	}
	
	public RelationInfo(float count){
		this.count = count;
	}

	public float getCount() {
		return count;
	}

	public void setCount(float count) {
		this.count = count;
	}
	
	public String toString(){
		return "R("+count+")";
	}
	
	public void increment(float count){
		this.count += count;
	}
}
