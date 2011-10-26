require 'evercraft'

describe Ability do

  it "has a score" do
    subject.score = 10
    subject.score.should == 10
  end

  it "has a modifier of 0 for a score of 10" do
    subject.score = 10
    subject.modifier.should == 0
  end

  it "has a modifier of +3 for a score of 16" do
    subject.score = 16
    subject.modifier.should == 3
  end

  it "has a modifier of +3 for a score of 17" do
    subject.score = 17
    subject.modifier.should == 3
  end

  it "has a modifier of -4 for a score of 2" do
    subject.score = 2
    subject.modifier.should == -4
  end

  it "has a modifier of -4 for a score of 3" do
    subject.score = 3
    subject.modifier.should == -4
  end

  it "has a modifier of +5 for a score of 20" do
    subject.score = 20
    subject.modifier.should == 5
  end

  it "has a modifier of -5 for a score of 1" do
    subject.score = 1
    subject.modifier.should == -5
  end

end

describe Character do
  
  it "has a name" do
    subject.name = 'Aragon'
    subject.name.should == 'Aragon'
  end
  
  it "has a default armor class of 10" do
    subject.armor_class.should == 10
  end

  it "has a default hit points of 5" do
    subject.hit_points == 5
  end

  it "has abilities" do
    subject.strength.should_not be_nil
    subject.dexterity.should_not be_nil
    subject.constitution.should_not be_nil
    subject.wisdom.should_not be_nil
    subject.intelligence.should_not be_nil
    subject.charisma.should_not be_nil
  end

  context "when attacking" do

    let(:target) { Character.new }

    it "hits when roll is greater than armor class" do
      subject.attack(target, 11).should be_true
    end 

    it "misses when roll is less than armor class" do
      subject.attack(target, 9).should be_false
    end 

    it "hits when roll is equal to armor class" do
      subject.attack(target, 10).should be_true
    end 

  end

  context "when hit" do

    it "takes 1 point of damage" do
      attacker = Character.new
      attacker.attack(subject, 11)
      subject.hit_points.should == 4
    end

    it "takes double damage when hit with a natural 20" do
      attacker = Character.new
      attacker.attack(subject, 20)
      subject.hit_points.should == 3
    end

  end

end
