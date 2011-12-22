require 'calculator'

describe Calculator do

  it "adds" do
    subject.add(2, 2).should == 4
  end

end
