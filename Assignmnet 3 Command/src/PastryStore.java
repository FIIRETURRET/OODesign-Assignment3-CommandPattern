import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class PastryStore {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Pastry orderPastry() throws IOException {
		Pastry pastry;
		
		pastry = createPastry();
		pastry.prepare();
		pastry.bake();
		
		return pastry;
	}
	
	protected abstract Pastry createPastry() throws IOException;
}
