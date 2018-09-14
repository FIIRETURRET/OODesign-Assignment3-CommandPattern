
public abstract class Pastry {
	String description = "Unknown Pastry";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost() ;
	public abstract String getEncounter();
	public abstract void solveEncounter(String s);
	
	abstract void prepare();
	
	void bake() {
		System.out.print("Brewing concoction...\n");
	}
}
