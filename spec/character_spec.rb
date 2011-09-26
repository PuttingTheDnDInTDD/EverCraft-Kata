require '../src/character.rb'

describe Character, 'Name' do
  it 'should return "Frodo" as the first name' do
    character = Character.new("Frodo", "Baggins")
    character.first_name.should == "Frodo"
  end
  
  it 'should return "Sauron" as the first name' do
    character = Character.new("Sauron", "Smith")
    character.first_name.should == "Sauron"
  end
  
  it 'should return "Baggins" as the last name' do
    character = Character.new("Frodo", "Baggins")
    character.last_name.should == "Baggins"
  end
  
end

describe Character, "Hit Points" do
  it 'should start out with 10' do
    character = Character.new("Frodo", "Baggins")
    character.hit_points.should == 10
  end
  
  
end