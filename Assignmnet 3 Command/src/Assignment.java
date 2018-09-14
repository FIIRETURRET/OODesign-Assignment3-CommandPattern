import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Assignment {

	public static void main(String[] args) throws IOException{
		// Create a key listener
		JTextField textField = new JTextField();
		textField.addKeyListener(new MKeyListener());
		JFrame jframe = new JFrame();
		jframe.add(textField);
		jframe.setSize(400, 350);
		jframe.setVisible(true);
		
		//NEW
		RemoteControl remoteControl = new RemoteControl();
		
		// Create all of the devices in their proper positions
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		// Create all the light command objects
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Create the on and off for the ceiling fan
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		// Create the up and down commands for the garage
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		// Create the stereo on and off commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffWithCD = new StereoOffCommand(stereo);
		
		// Load commands into remote control slots
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		
		// Print each remote slot and the command assigned to it
		System.out.println(remoteControl);
		
		//step trough each slot and push its on and off button
		// TODO: Maybe add functionality for the player to press a button at any point in the game to light torches, rest, dig etc by making remote button pushes a decorator.
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		//OLD
		PastryStore PieStore = new PieStore();
		PastryStore SconeStore = new SconeStore();
		PastryStore CremePuffStore = new CremePuffStore();
		PastryStore UnknownPastryStore = new UnknownPastryStore();
		Pastry pastry = new Pie();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to the dungeon run pick a class. "
				+ "\n 1.Pie:"
				+ "\n 2.Scone:"
				+ "\n 3.Creme Puff:");
		String s = br.readLine();
		if (s.equals("1")) {
			System.out.println("You have chosen Pie, Huzza!\n");
			//TODO add diferent types of pies with 'enchantments' take in input from the user.
			pastry = PieStore.orderPastry();
		}
		else if (s.equals("2")) {
			System.out.println("You have chosen Scone my good chap.\n");
			pastry = SconeStore.orderPastry();
		}
		else if (s.equals("3")) {
			System.out.println("You have chosen the Creme Puff, long may he puff!\n");
			pastry = CremePuffStore.orderPastry();
		}
		else {
			System.out.println("You sir and or madam, do now know how to follow simple directions.\n "
					+ "Very well... we shall push forward.\n");
			pastry = UnknownPastryStore.orderPastry();
		}
		
		System.out.println("Congrats you have made " + pastry.getDescription() + ".\nFinal Score: " + pastry.cost() + " /16");
	}

}
