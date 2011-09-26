class Character
  attr_accessor :first_name, :last_name, :hit_points

  def initialize (first_name, last_name)
    @first_name = first_name
    @last_name = last_name
    @hit_points = 10
  end
  
end