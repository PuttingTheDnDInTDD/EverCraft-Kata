/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

/**
 * @author walterg2
 *
 */
public class CharacterAbility {
	
	private int baseScore = 10;
	
	public CharacterAbility() {
	}
	
	public CharacterAbility(int score) {
		this.baseScore = score;
	}
	
	public int getScore() {
		return this.baseScore;
	}

}
