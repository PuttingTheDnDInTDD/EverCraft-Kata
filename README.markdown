#EverCraft Requirements
##Iteration 1 - The Basics
###Feature: Create a Character
As a character I want to have a name so that I can be distinguished from other characters
 - Name

###Feature: Armor Class & Hit Points
As a combatant I want to have an armor class and hit points so that I can resist attacks from my enemies
 - Armor Class 10
 - Hit Points 5

###Feature: Character can Attack
As a combatant I want to be able to attack other combatants so that I can survive to fight another day
 - Roll a 20 sided die
 - Meet or beat armor class === hit

###Feature: Character can be Damaged
As an attacker I want to be able to damage my enemies so that they will die and I will live
 - If attack is successful, other character takes 1 point of damage when hit
 - If a roll is a natural 20 then a critical hit is dealt and the damage is doubled

###Feature: Character has Abilities and Attributes
As a character I want to have several abilities so that I am not identical to other characters except in name
 - Abilities range from 1 to 20
 - Abilities: Strength, Dexterity, Constitution, Wisdom, Intelligence, Charisma

###Feature: Character Abilities Modify Attributes
As a character I want to have modifiers derived from my abilities that improve my capabilites in combat so that I can vanquish my enemy with extreme prejudice
 - Abilities obtain modifiers based on the table below
 - Modifier for Strength
	- Add modifier to attack roll
	- Add modifier to damage dealt
 - Modifier for Dexterity
	- Add modifier to armor class
 - Modifier for Constitution
	- Add modifier to hit points

  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  |  11  |  12  |  13  |  14  |  15  |  16  |  17  |  18  |  19  |  20  |
 -5  | -4  | -4  | -3  | -3  | -2  | -2  | -1  | -1  |  0   |  0   |  +1  |  +1  |  +2  |  +2  |  +3  |  +3  |  +4  |  +4  |  +5  |

##Iteration 2 - Classes, Races, & Levels
###Feature: A Character has a level
As a character I want to have levels that improve my combat capabilites so that I can bring vengence to my foes
 - Level defaults to 1
 - For each level:
	- hit points increase by 5 plus Con modifier
	- A 1 is added to attack roll for every even level achieved

###Feature: A Character can gain experience when attacking
As a character I want to increase my level though experience so that I can be tougher than the next guy
 - When a successful attack occurs, the character gains 10 experience points
 - When a character kills an opponent, the character gains 25 experience points
 - After 1000 experience points, the character gains a level
    0 xp -> 1st Level
    1000 xp -> 2nd Level
    2000 xp -> 3rd Level
    etc.

###Feature: Characters have Classes
As a player I want a character to have a class that customizes its capabilities so that I can play more interesting characters
 - changes in hit points
 - changes in attack and damage
 - increased critical range or damage
 - bonuses/penalties versus other classes
 - special abilities

###Feature: Characters have Classes
As a player I want a character to have a race that customizes its capabilities so that I can play more interesting characters
 - changes in abilities
 - increased critical range or damage
 - bonuses/penalties versus other races
 - special abilities

##Iteration 3 - Weapons & Armor
###Feature: Weapons
As a character I want to be able to wield weapons so that I can achieve victory through superior firepower
  - character can wield only one weapon
  - basic weapons that improve damage (dagger)
  - basic weapons that improve to attacks (+1 sword)
  - magic weapons with special properties (knife of ogre slaying)

###Feature: Armor
As a character I want to be able to don armor and shield so that I can protect myself from attack
  - character can only don one shield and wear one suit of armor
  - basic armor that improves armor class (plate)
  - magic armor that has special properties

##Iteration 4 - Magic
###Feature: Spellcasting
