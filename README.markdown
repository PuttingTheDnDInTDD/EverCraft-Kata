#EverCraft Requirements

##Iteration 1 - The Basics

###Feature: Create a Character

As a character I want to have a name so that I can be distinguished from other characters

- can get and set Name

###Feature: Armor Class & Hit Points

As a combatant I want to have an armor class and hit points so that I can resist attacks from my enemies

- has an Armor Class that defaults to 10
- has 5 Hit Points by default

###Feature: Character Can Attack

As a combatant I want to be able to attack other combatants so that I can survive to fight another day

- roll a 20 sided die (don't code the die)
- roll must meet or beat opponents armor class to hit

###Feature: Character Can Be Damaged

As an attacker I want to be able to damage my enemies so that they will die and I will live

- If attack is successful, other character takes 1 point of damage when hit
- If a roll is a natural 20 then a critical hit is dealt and the damage is doubled
- when hit points are 0 or less, the character is dead

###Feature: Character Has Abilities Scores

As a character I want to have several abilities so that I am not identical to other characters except in name

- Abilities are Strength, Dexterity, Constitution, Wisdom, Intelligence, Charisma
- Abilities range from 1 to 20 and default to 10
- Abilities have modifiers according to the following table

    Score    |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  |  11  |  12  |  13  |  14  |  15  |  16  |  17  |  18  |  19  |  20  |
    Modifier | -5  | -4  | -4  | -3  | -3  | -2  | -2  | -1  | -1  |   0  |   0  |  +1  |  +1  |  +2  |  +2  |  +3  |  +3  |  +4  |  +4  |  +5  |

###Feature: Character Ability Modifiers Modify Attributes

As a character I want to apply my ability modifiers improve my capabilites in combat so that I can vanquish my enemy with extreme prejudice

- add Strength modifier to:
  - attack roll and damage dealt
  - double Strength modifier on critical hits
  - minimum damage is always 1 (even on a critical hit)
- add Dexterity modifier to armor class
- add Constitution modifier to hit points (always at least 1 hit point)

##Iteration 2 - Classes, Races, & Levels

###Feature: A Character can gain experience when attacking

As a character I want to accumulate experience points when I attack my enemies so that I can earn bragging rights at the tavern

- When a successful attack occurs, the character gains 10 experience points

###Feature: A Character Can Level

As a character I want my experience points to increase my level and combat capabilities so that I can bring vengence to my foes

- Level defaults to 1
- After 1000 experience points, the character gains a level 
  - 0 xp -> 1st Level
  - 1000 xp -> 2nd Level
  - 2000 xp -> 3rd Level
  - etc.
- For each level:
- hit points increase by 5 plus Con modifier
- A 1 is added to attack roll for every even level achieved

###Feature: Characters Have Classes

As a player I want a character to have a class that customizes its capabilities so that I can play more interesting characters

- ideas
  - changes in hit points
  - changes in attack and damage
  - increased critical range or damage
  - bonuses/penalties versus other classes
  - special abilities

####Samples

As a player I want to play a fighter so that I can kick ass and take names

- attacks roll is increased by 1 for every level instead of every other level
- has 10 hit points per level instead of 5

As a player I want to play a rogue so that I can defeat by enemies with finesse

- does triple damage on critical hits
- ignores an opponents Dexterity modifier (if positive) to Armor Class when attacking
- adds Dexterity modifier to attacks instead of Strength

As a player I want to play a war monk so that I can enjoy being an Asian archetype in a Medieval European setting

- does 3 points of damage instead of 1 when successfully attacking
- adds Wisdom modifier (if positive) to Armor Class in addition to Dexterity
- attack roll is increased by 1 every 2nd and 3rd level

###Feature: Characters Have Races

As a player I want a character to have a race that customizes its capabilities so that I can play more interesting characters

- ideas
  - changes in abilities
  - increased critical range or damage
  - bonuses/penalties versus other races
  - special abilities

####Samples

As a player I want to play an Orc so that I can be crude, drunk, and stupid

- +4 to Strength Score, -2 to Intelligence, Wisdom, and Charisma Scores
- +2 to Armor Class due to thick hide

As a player I want to play a Dwarf so that I can drink more than the orc

- +2 to Constitution Score, -2 to Charisma Score
- +2 when attacking orcs (Dwarves hate Orcs)
- doubles Constitution Modifier when adding to hit points per level

As a player I want to play an Elf so that I can drink wine and snub my nose at the crude dwarf and orc

- +2 to Dexterity Score, -2 to Constitution Score 
- does a critical hit on a 19 or 20, not just a 20
- +2 to Armor Class when being attacked by orcs

As a player I want to play a Human so that I can at least drink the elf under the table

- +2 to all attacks (humans are well trained fighters)

##Iteration 3 - Weapons, Armor & Items

###Feature: Weapons

As a character I want to be able to wield weapons so that I can achieve victory through superior firepower

- character can wield only one weapon
- ideas
  - basic weapons that improve damage (dagger)
  - basic weapons that improve to attacks (+1 sword)
  - magic weapons with special properties (knife of ogre slaying)
  - weapons that certain classes or races can or cannot wield

####Samples

As a character I want to be able to wield a sword so that I can look cool

- does 5 points of damage

As a character I want to be able to wield a magic axe that so that I can *be* cool

- does 6 points of damage
- +2 to attack
- +2 to damage
- triple damage on a critical

As an elf I want to be able to wield a elven longsword that so I can stick it to that orc with the magic axe

- does 6 points of damage
- +1 to attack and damage
- +2 to attack and damage when wielded by an elf *or* against an orc
- +5 to attack and damage when wielded by an elf *and* against orc

As a monk I want nun checku that work with my martial arts so that I can kick shaolin style

- does 6 points of damage
- when used by a non-monk there is a -4 penalty to attack

###Feature: Armor

As a character I want to be able to don armor and shield so that I can protect myself from attack

- character can only don one shield and wear one suit of armor
- ideas
  - basic armor that improves armor class (plate)
  - magic armor that has special properties
  - armor and shields that are or are not usable by certain races or classes

####Samples

As a fighter I want to be able to wear plate armor so that I can ignore the blows of my enemies

- +8 to Armor Class
- can only be worn by fighters, dwarves, of dwarven fighters

As a character I want to the be able to wear magical leather armor so that I can soften attacks against me

- +2 to Armor Class
- -2 to all damage received

As an elf I want magic chainmail so that I can fit in with all the other elves

- +5 to Armor Class
- +8 to Armor Class if worn by an elf
- +1 to atack if worn by an elf 

###Feature: Items

As a character I want to be able to have items that enhance my capabilities so that I can be more bad-ass

- can carry multiple items
- ideas
  - items that improve combat with types of weapons
  - items that improve stats against certain types of critters
  - items that improve abilities

####Samples

As a character I want to be able to wear a ring of protection so that I can be protected from attack

  - adds +2 to armor class

As a character I want to be able to war a belt of giant strength so that I can be even stronger in combat

  - add +4 to Strength Score

##Iteration 4 - Magic

###Feature: Spellcasting
