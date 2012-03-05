/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

import com.walterg2.evercraft.domain.characters.CharacterAbility.Abilities;

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
	private CharacterAbility strength = new CharacterAbility(Abilities.STRENGTH, 10);
	
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
		int damage = 1;
		
		if (defender.getArmorClass() > roll) {
			return false;
		}
		
		defender.damage((roll == 20) ? damage * 2 : damage);
		return true;
	}
	
	public boolean damage(int damageTaken) {
		this.hitPoints = this.hitPoints - damageTaken;
		
		if (this.hitPoints < 0) {
			this.hitPoints = 0;
		}
		
		return true;
	}
	
	public boolean isDead() {
		if (this.hitPoints > 0) {
			return false;
		}
		return true;
	}
	
	public CharacterAbility getStrength() {
		return strength;
	}

}
