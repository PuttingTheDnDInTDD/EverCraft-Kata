require 'evercraft'

describe Character do
  it "has a name" do
    subject.name = 'Aragon'
    subject.name.should == 'Aragon'
  end
  it "had a default armor class of 10" do
    subject.armor_class.should == 10
  end
end
