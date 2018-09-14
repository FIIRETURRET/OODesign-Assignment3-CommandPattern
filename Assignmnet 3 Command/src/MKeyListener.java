import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MKeyListener extends KeyAdapter{

	RemoteControl remoteControl = new RemoteControl();
	boolean lightIsOn = false;
	boolean lanturnIsOn = false;
	boolean campIsOn = false;
	boolean stereoOn = false;
	
	public MKeyListener() {
		
		// Create all of the devices in their proper positions
		Light torchLight = new Light("Torch");
		Light lanturnLight = new Light("Lanturn");
		Camp camp = new Camp("Camp");
		Search search = new Search("Search");
		Stereo stereo = new Stereo("Living Room");
		
		// Create all the light command objects
		LightOnCommand torchOn = new LightOnCommand(torchLight);
		LightOffCommand torchOff = new LightOffCommand(lanturnLight);
		LightOnCommand lanturnOn = new LightOnCommand(lanturnLight);
		LightOffCommand lanturnOff = new LightOffCommand(lanturnLight);
		
		// Create the on and off for the ceiling fan
		CampOnCommand campOn = new CampOnCommand(camp);
		CampOffCommand campOff = new CampOffCommand(camp);
		
		// Create the up and down commands for the garage
		SearchOnCommand searchOn = new SearchOnCommand(search);
		SearchOffCommand searchOff = new SearchOffCommand(search);
		
		// Create the stereo on and off commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffWithCD = new StereoOffCommand(stereo);
		
		// Load commands into remote control slots
		remoteControl.setCommand(0, torchOn, torchOff);
		remoteControl.setCommand(1, lanturnOn, lanturnOff);
		remoteControl.setCommand(2, campOn, campOff);
		remoteControl.setCommand(3, searchOn, searchOff);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);
	}
	
	
	
	 @Override
	 public void keyPressed(KeyEvent event) {
		 char ch = event.getKeyChar();
		 // Torch control
		 if (ch == 't' && lightIsOn == false) {
			 //System.out.println(event.getKeyChar());
			 remoteControl.onButtonWasPushed(0);
			 lightIsOn = true;
		 }
		 else if (ch == 't' && lightIsOn == true) {
			 remoteControl.offButtonWasPushed(0);
			 lightIsOn = false;
		 }
		 // Lanturn control
		 else if (ch == 'l' && lanturnIsOn == false) {
			 remoteControl.onButtonWasPushed(1);
			 lanturnIsOn = true;
		 }
		 else if (ch == 'l' && lanturnIsOn == true) {
			 remoteControl.offButtonWasPushed(1);
			 lanturnIsOn = false;
		 }
		 // Camping control
		 else if (ch == 'c' && campIsOn == false) {
			 remoteControl.onButtonWasPushed(2);
			 campIsOn = true;
		 }
		 else if (ch == 'c' && campIsOn == true) {
			 remoteControl.offButtonWasPushed(2);
			 campIsOn = false;
		 }
		 // Search control
		 else if (ch == 's') {
			 remoteControl.onButtonWasPushed(3);
		 }
		 // Stereo control
		 else if (ch == 'z' && stereoOn == false) {
			 remoteControl.onButtonWasPushed(4);
		 }
		 else if (ch == 'z' && stereoOn == true) {
			 remoteControl.offButtonWasPushed(4);
		 }

		 if (event.getKeyCode() == KeyEvent.VK_HOME) {

			 System.out.println("Key codes: " + event.getKeyCode());

		 }
	  }
}
