public class ButtonDecorator extends BakingDecorator {
	Pastry pastry;
	RemoteControl remoteControl = new RemoteControl();
	double score = 0;
	
	public ButtonDecorator (Pastry pastry) {
		this.pastry = pastry;
	}
	
	public String getDescription() {
		return null;
	}
	
	public String getEncounter() {
		return "\nPress f for flashlight";
	}
	
	public void solveEncounter(String s) {
		if (s.equals("f")) {
			remoteControl.onButtonWasPushed(0);
		}
		else {
			
		}
	}
	
	public double cost() {
		return 0;
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
	
	
}