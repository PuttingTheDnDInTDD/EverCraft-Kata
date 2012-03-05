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

import com.walterg2.evercraft.domain.characters.CharacterAbility.Abilities;

/**
 * @author walterg2
 *
 */
public class CharacterAbilityTest {

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCanReturnDefaultScoreOf10() {
		assertEquals(new CharacterAbility().getScore(), 10);
	}

	@Test
	public void testCanReturnInitializedScores() {
		assertEquals(new CharacterAbility(Abilities.STRENGTH, 12).getScore(), 12);
		assertEquals(new CharacterAbility(Abilities.STRENGTH, 2).getScore(), 2);
		assertEquals(new CharacterAbility(Abilities.STRENGTH, 20).getScore(), 20);
		assertEquals(new CharacterAbility(Abilities.STRENGTH, 7).getScore(), 7);
	}

}
