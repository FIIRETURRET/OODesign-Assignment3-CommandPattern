
public class Apple extends BakingDecorator {
	Pastry pastry;
	double score = 0;
	
	public Apple (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 3) {
			return pastry.getDescription() + " With Apple Filling";
		}
		else {
			return pastry.getDescription() + " Thats a little worse for wear";
		}
	}
	
	public String getEncounter() {
		return "You walk down a long hallway and spot an Apple! \n What do you do? "
				+ "\n 1: Take a big bite."
				+ "\n 2: Grab your peeler and attack!";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("The Apple Bites Back! \n Take 1 damage\n");
			score = -3;
		}
		else if (s.equals("2")) {
			System.out.println("You smite the apple and harvest its flesh. \n +3 points\n");
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
