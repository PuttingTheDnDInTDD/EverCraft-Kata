class Character
  
  attr_accessor :name, :strength, :dexterity, :constitution, :intelligence, :wisdom, :charisma
  attr_reader :hit_points, :armor_class
  
  def initialize
    @hit_points = 5
    @armor_class = 10
    @strength = Ability.new
    @dexterity = Ability.new
    @constitution = Ability.new
    @intelligence = Ability.new
    @wisdom = Ability.new
    @charisma = Ability.new
  end

  def attack(target, roll)
    !target.defend roll
  end

  def defend(roll)
    hit = roll >= @armor_class
    damage = (roll == 20) ? 2 : 1
    @hit_points -= damage if hit
    !hit
  end

end

class Ability

  attr_reader :score, :modifier

  def score=(score)
    @score = score
    @modifier = (@score - 10) / 2
  end

end
