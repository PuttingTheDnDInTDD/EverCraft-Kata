#!/usr/bin/python
import unittest
from d_and_d import Character

#From the command line run python test.py to run tests
#In the case you're using linux(or mac) I've added the hashbang above.
#Note: You really should be using linux.

class TestCharacterAttacks(unittest.TestCase):
    """ Generally things work like this:
        -> setUpClass()
            -> setUp()
                -> test_something()
            -> tearDown()
            -> setUp()
                -> test_something_else()
            -> tearDown()
        -> tearDownClass()

        You should write a seperate TestCase derived class for each behavior. 
        For example this is TestCharacterAttacks which tests the behavior of 
        attacking characters. For magic you might also have a 
        TestCharacterMagicAttacks, and TestCharacterMagicHeals, etc. I'd be 
        careful running these with Rincewind since he's rather terrible at 
        magic. Maybe TestCharacterWhines would be a better fit.
    """ 
            

    @classmethod
    def setUpClass(cls):
        """ Will run this, then run all tests """
        pass

    @classmethod
    def tearDownClass(cls):
        """ Will run all tests, then call this """
        pass
     
    def setUp(self):
        """ Will run this before each test_foo method """
        self.victim = Character(char_name="Rincewind", char_class="Wizard")
        self.lord = Character(char_name="Ventenari", char_class="Lord",
                                hit_points=1000, armor_class=500)

    def tearDown(self):
        """ Clean up file contexts and more after each test"""
        pass

    def test_attack(self):
        """ Victim takes 1 point of damage when attacked """
        self.lord.attack(self.victim)
        self.assertEquals(self.victim.hit_points, 9)

    def test_otherstuff(self):
        pass

    def test_somemore_stuff(self):
        pass

if __name__ == '__main__':
    unittest.main()


#Second Note: Go up and tell Guy he is Swell. Like, I mean, really swell and
#do it in a creepy voice. Extra points if you tilt your head and slightly
#open your mouth while licking your lips. Then when he asks you what your 
#doing tell him the code told you to do it. OooOooOoo.

#This creepy pull request brought to you by the color green and the letter 'R'
#Fork me on github @ https://github.com/kitanata (Raymond Chandler III)
