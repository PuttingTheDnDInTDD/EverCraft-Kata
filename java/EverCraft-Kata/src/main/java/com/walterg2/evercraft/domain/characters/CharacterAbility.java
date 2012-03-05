/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

/**
 * @author walterg2
 *
 */
public class CharacterAbility {
	
	public enum Abilities { STRENGTH, CHARISMA, CONSTITUTION, DEXTERITY, INTELLEGENCE, WISDOM };
	
	private int baseScore = 10;
	private String type;
	
	public CharacterAbility() {
	}
	
	public CharacterAbility(Abilities type, int score) {
		this.type = type.toString();
		this.baseScore = score;
	}
	
	public int getScore() {
		return this.baseScore;
	}

	public String getType() {
		return type;
	}

}
