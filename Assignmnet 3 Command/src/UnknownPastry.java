
public class UnknownPastry extends Pastry{
	public UnknownPastry() {
		description = "An unknown pastry";
	}
	
	public double cost() {
		return 0;
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
		System.out.println("Prepairing Something");
		
	}
}
