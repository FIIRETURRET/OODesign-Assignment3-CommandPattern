
public class Sugar extends BakingDecorator{
	Pastry pastry;
	double score = 0;
	
	public Sugar (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 3) {
			return pastry.getDescription() + " With a sweet taste";
		}
		else {
			return pastry.getDescription() + " which fails to satisfy your sweet tooth";
		}
	}
	
	public String getEncounter() {
		return "Turning a corner you spot a bag of sugar gesticulating about itself \n What do you do? "
				+ "\n 1: Sneak around the bag while scooping the left over sugar off the gound."
				+ "\n 2: answer its gesticulation with your own undulation.";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("Your able to grab your sugar without being noticed. However you don't know if this will be enough. \n +2 points\n");
			score = 2;
		}
		else if (s.equals("2")) {
			System.out.println("The bag of sugar is no match for your movement, you sieze the entire bag. Pretty sweet. \n +3 points\n");
			score = 3;
		}
	}
	
	public double cost() {
		return pastry.cost() + score;
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
}
