
public class Flour extends BakingDecorator{
	Pastry pastry;
	double score = 0;
	
	public Flour (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 3) {
			return pastry.getDescription() + " With extra gluten";
		}
		else {
			return pastry.getDescription() + " that is far too crumbly";
		}
	}
	
	public String getEncounter() {
		return "You see a white trail of dust on the floor. Looking closer you see it is a flour whisp haunting the hallways. What do you do? "
				+ "\n 1: Sweep up the flour."
				+ "\n 2: Push it under the  rug.";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("You sweep up the trail and the whisp thanks you \n +3 points\n");
			score = 3;
		}
		else if (s.equals("2")) {
			System.out.println("As you drop the rug the flour blows out from under covering your face and making you sneez. \n -3 points\n");
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
