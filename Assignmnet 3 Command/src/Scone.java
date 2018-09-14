
public class Scone extends Pastry{
	public Scone() {
		description = "A scone";
	}
	
	public double cost() {
		return 4.00;
	}

	@Override
	public String getEncounter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void solveEncounter(String s) {
		// TODO Auto-generated method stub
		
	}
	
	void prepare() {
		System.out.println("Prepairing Scone");
		
	}
}
