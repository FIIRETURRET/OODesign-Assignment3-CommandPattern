
public class Yeast extends BakingDecorator{
	Pastry pastry;
	double score = 0;
	
	public Yeast (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 2) {
			return pastry.getDescription() + " That is light and fluffy";
		}
		else {
			return pastry.getDescription() + " that is burned to a crisp";
		}
	}
	
	public String getEncounter() {
		return "You make your way to a grand foyer. Suddenly a vortex of small grainy particles begin to swirl and form around you. You encounter a Yeast Elemental! What do you do? "
				+ "\n 1: Leave the room and close the door."
				+ "\n 2: Light a fire, the elemental can't form a vortex if there is no air!";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("You leave the room shutting the door behind you. Hey! You find a bag of yeast on the floor. \n +2 points\n");
			score = 2;
		}
		else if (s.equals("2")) {
			System.out.println("You spark to life a fire. the Yeast elemental turns a blaze lighting the entire foyer on fire in the process.\n"
					+ " You accedentally drop your homework for Object Oriented Design Patterns and it burns to a crisp. \n Take 1 damage.\n");
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
