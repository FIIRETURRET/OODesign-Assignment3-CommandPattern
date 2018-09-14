import java.io.IOException;

public class SconeStore extends PastryStore{

	@Override
	protected Pastry createPastry() throws IOException {
		// TODO Auto-generated method stub
		Pastry pastry = new Scone();
		
		// Scone Encounter 1
		pastry = new Sugar(pastry);
		System.out.println(pastry.getEncounter());
		String s = br.readLine();
		pastry.solveEncounter(s);
		// Scone Encounter 2
		pastry = new Flour(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		// Scone Encounter 3
		pastry = new BakingSoda(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		return pastry;
	}

}
