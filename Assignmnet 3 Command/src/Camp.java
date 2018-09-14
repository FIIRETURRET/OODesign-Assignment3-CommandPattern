public class Camp {
	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public Camp(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		level = HIGH;
		System.out.println(location + " is set up");
 
	} 
 
	public void off() {
		// turns the ceiling fan off
		level = 0;
		System.out.println(location + " is dismantled");
	}
 
	public int getSpeed() {
		return level;
	}
}