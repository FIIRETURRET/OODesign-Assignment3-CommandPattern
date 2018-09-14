
public class CremePuff extends Pastry{
	public CremePuff() {
		description = "A Creme Puff";
	}
	
	public double cost() {
		return 5.00;
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
		System.out.println("Prepairing Creme Puff");
		
	}
}
