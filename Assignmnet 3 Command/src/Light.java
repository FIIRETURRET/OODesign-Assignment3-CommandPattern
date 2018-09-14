public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("\n" + location + " is light");
	}

	public void off() {
		System.out.println("\n" + location + " is put out");
	}
}