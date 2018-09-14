
public class BakingSoda extends BakingDecorator {
	Pastry pastry;
	double score = 0;
	
	public BakingSoda (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 3) {
			return pastry.getDescription() + " That is nice and flakey";
		}
		else {
			return pastry.getDescription() + " That's as heavy as a rock";
		}
	}
	
	public String getEncounter() {
		return "As you pass though the chamber the walls begin to ooze and bubble. You have set off a Baking Soda Trap!\n What do you do? "
				+ "\n 1: It's ok the walls always do that."
				+ "\n 2: Grab the nearest lever and pull!";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("You casually stroll trough the chamber while swiping a cup of baking soda. \n +3 points\n");
			score = 3;
		}
		else if (s.equals("2")) {
			System.out.println("Lunging out your grab at the first lever you see, surely this will help you! Pulling the lever a tub of Nickolodian slime pours onto you head! Got ya \n You take 1 damage to your pride\n");
			score = -3;
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
