import java.io.IOException;

public class PieStore extends PastryStore{

	@Override
	protected Pastry createPastry() throws IOException {
		// TODO Auto-generated method stub
		Pastry pastry = new Pie();
		
		// Pie Encounter 1
		pastry = new Apple(pastry);
		System.out.println(pastry.getEncounter());
		String s = br. readLine();
		pastry.solveEncounter(s);
		
		pastry = new ButtonDecorator(pastry);
		System.out.println(pastry.getEncounter());
		s = br. readLine();
		pastry.solveEncounter(s);
		
		
		// Pie Encounter 2
		pastry = new Flour(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		// Pie Encounter 3
		pastry = new Butter(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		return pastry;
	}

}
