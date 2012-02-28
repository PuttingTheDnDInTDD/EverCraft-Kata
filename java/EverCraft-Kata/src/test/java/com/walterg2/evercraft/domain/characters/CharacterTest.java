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

/**
 * @author walterg2
 *
 */
public class CharacterTest {

	private static Character character;
	private static final String characterName = "Rieekan";
	private static final String characterAlignmentGood = "Good";
	private static final String characterAlignmentNeutral = "Neutral";
	private static final String characterAlignmentEvil = "Evil";

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

}
