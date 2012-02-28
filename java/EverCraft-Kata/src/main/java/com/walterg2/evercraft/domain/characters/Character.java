/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

/**
 * @author walterg2
 *
 */
public class Character {
	
	private String name;
	private String alignment;
	private int armorClass = 10;
	private int hitPoints = 5;
	
	public Character(String name, String alignment) {
		this.name = name;
		this.alignment = alignment;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the alignment
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * @return the armorClass
	 */
	public int getArmorClass() {
		return armorClass;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}
	
	public boolean attack(Character defender, int roll) {
		
		return true;
	}

}
