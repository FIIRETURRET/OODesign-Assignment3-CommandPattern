import java.io.IOException;

public class UnknownPastryStore extends PastryStore{

	@Override
	protected Pastry createPastry() throws IOException {
		// TODO Auto-generated method stub
		Pastry pastry = new UnknownPastry();
		
		// CremePuff Encounter 1
		pastry = new Sugar(pastry);
		System.out.println(pastry.getEncounter());
		String s = br.readLine();
		pastry.solveEncounter(s);
		// TODO add an egg encounter
		// CremePuff Encounter 1
		pastry = new Yeast(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		return pastry;
	}

}
