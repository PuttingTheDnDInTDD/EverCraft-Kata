#EverCraft Requirements
##Iteration 1 - The Basics
###Feature: Create a Character
 - Name
 - Armor Class 10
 - Hit Points 5

###Feature: Character can Attack
 - Roll a 20 sided die
 - Meet or beat armor class === hit

###Feature: Character can be Damaged
 - If attack is successful, other character takes 1 point of damage when hit
 - If a roll of 20 is made, damage is doubled

###Feature: Character has Abilities and Attributes
 - Abilities:
	- Strength
	- Dexterity
	- Constitution
	- Wisdom
	- Intelligence
	- Charisma
 - Abilities range from 1 to 20

###Feature: Character Abilities Modify Attributes
 - Abilities obtain modifiers based on the table below
 - Modifier for Strength
	- Add modifier to attack roll
	- Add modifier to damage received
 - Modifier for Dexterity
	- Add modifier to armor class
 - Modifier for Constitution
	- Add modifier to hit points

  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  |  11  |  12  |  13  |  14  |  15  |  16  |  17  |  18  |  19  |  20  |
 -5  | -4  | -4  | -3  | -3  | -2  | -2  | -1  | -1  |  0   |  0   |  +1  |  +1  |  +2  |  +2  |  +3  |  +3  |  +4  |  +4  |  +5  |

##Iteration 2 - Classes, Races, & Levels
###Feature: A Character has a level
 - Level defaults to 1
 - For each level:
	- hit points increase by 5
	- A roll modifier of 1 is added for every level achieved

###Feature: A Character can gain experience when attacking
 - When a successful attack occurs, the character 
