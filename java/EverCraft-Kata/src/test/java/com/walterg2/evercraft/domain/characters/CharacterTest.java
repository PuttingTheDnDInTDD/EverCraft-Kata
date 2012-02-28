/**
 * 
 */
package com.walterg2.evercraft.domain.characters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.walterg2.evercraft.domain.characters.Character.Alignment;

/**
 * @author walterg2
 *
 */
public class CharacterTest {

	private static Character character;
	private static Character defender;
	private static final String characterName = "Rieekan";
	private static final Alignment characterAlignmentGood = Alignment.GOOD;
	private static final Alignment characterAlignmentNeutral = Alignment.NEUTRAL;
	private static final Alignment characterAlignmentEvil = Alignment.EVIL;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		character = new Character(characterName, characterAlignmentGood);
		defender = new Character("Bob", characterAlignmentGood);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCharacterHasAName() {
		assertEquals(character.getName(), characterName);
	}
	
	@Test
	public void testCharacterCanHaveAGoodAlignment() {
		assertEquals(character.getAlignment(), characterAlignmentGood);
	}

	@Test
	public void testCharacterCanHaveANeutralAlignment() {
		Character character = new Character(characterName, characterAlignmentNeutral);
		
		assertEquals(character.getAlignment(), characterAlignmentNeutral);
	}

	@Test
	public void testCharacterCanHaveAnEvilAlignment() {
		Character character = new Character(characterName, characterAlignmentEvil);
		
		assertEquals(character.getAlignment(), characterAlignmentEvil);
	}
	
	@Test
	public void testCharacterHasABaseArmorClassOf10() {
		assertEquals(character.getArmorClass(), 10);
	}

	@Test
	public void testCharacterHasInitialHitPointsOf5() {
		assertEquals(character.getHitPoints(), 5);
	}
	
	@Test
	public void testCharacterCanSuccessfullyAttackAnother() {
		assertTrue(character.attack(defender, (defender.getArmorClass() + 2)));
	}

	@Test
	public void testCharacterCanUnsuccessfullyAttackAnother() {
		assertFalse(character.attack(defender, (defender.getArmorClass() - 2)));
	}
	
	@Test
	public void testDefendingCharacterCanBeDamaged() {
		int defenderStartingHitPoints = defender.getHitPoints();
		character.attack(defender, (defender.getArmorClass() + 2));
		
		assertEquals(defender.getHitPoints(), (defenderStartingHitPoints - 1));
	}

	@Test
	public void testDefendingCharacterReceivesDoubleDamageForCriticalHit() {
		int defenderStartingHitPoints = defender.getHitPoints();
		character.attack(defender, 20);
		
		assertEquals(defender.getHitPoints(), (defenderStartingHitPoints - 2));
	}

	@Test
	public void testDefendingCharacterIsDead() {
		character.attack(defender, 20);
		character.attack(defender, 20);
		character.attack(defender, 20);
		
		assertTrue(defender.isDead());
	}

	@Test
	public void testDefendingCharacterIsNotDead() {
		character.attack(defender, 20);
		
		assertFalse(defender.isDead());
	}

}
