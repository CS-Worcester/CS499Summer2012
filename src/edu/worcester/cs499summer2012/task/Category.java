/*
 * Category.java
 * 
 * Copyright 2012 Jonathan Hasenzahl, James Celona, Dhimitraq Jorgji
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.worcester.cs499summer2012.task;

public class Category {

	private int id;
	private String name;
	private int color;
	private long updated;

	public Category() {}
	
	public Category(String name, int color, long updated) {
		this.name = name;
		this.color = color;
	}
	
	public Category(int id, String name, int color, long updated) {
		this(name, color, updated);
		this.id = id;
	}
	
	public Category(Category c) {
		this(c.id, c.name, c.color, c.updated);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public long getUpdated(){
		return updated;
	}
	
	public void setUpdated(long updated){
		this.updated = updated;
	}
}
