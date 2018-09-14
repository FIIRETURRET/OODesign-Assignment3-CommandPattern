
public class Butter extends BakingDecorator {
	Pastry pastry;
	double score = 0;
	
	public Butter (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		if (score == 3) {
			return pastry.getDescription() + " That is rich in taste";
		}
		else {
			return pastry.getDescription() + " That lacks substance";
		}
	}
	
	public String getEncounter() {
		return "A large slobbering stick of butter stops you in your tracks. It lunges twoard you!\n What do you do? "
				+ "\n 1: Roll out of the way!"
				+ "\n 2: Stand your ground!";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("1")) {
			System.out.println("You roll into the wall banging your head on stone!\n Take one damage\n");
			score = -3;
		}
		else if (s.equals("2")) {
			System.out.println("You stand your ground as the butter forms around you. You are un-scathed. This stick of butter must have been room temperature. \n +3 points\n");
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
