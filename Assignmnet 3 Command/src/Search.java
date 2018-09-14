public class Search {
	String location;
	int searchTries = 1;
	//TODO: reset searchTries when player sets up camp.
	
	public Search(String location) {
		this.location = location;
	}

	public void up() {
		if (searchTries > 0) {
			System.out.println(location + " commencing");
			searchTries --;
		}
		else {
			down();
		}
	}

	public void down() {
		System.out.println("Too tired to" + location);
	}

}