/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

/**
 * @author walterg2
 *
 */
public class Character {
	
	public enum Alignment { EVIL, NEUTRAL, GOOD };

	private String name;
	private Alignment alignment;
	private int armorClass = 10;
	private int hitPoints = 5;
	
	public Character(String name, Alignment alignment) {
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
	public Alignment getAlignment() {
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
		
		if (defender.getArmorClass() > roll) {
			return false;
		}
		
		defender.damage(1);
		return true;
	}
	
	public boolean damage(int damageTaken) {
		this.hitPoints = this.hitPoints - damageTaken;
		
		return true;
	}

}
