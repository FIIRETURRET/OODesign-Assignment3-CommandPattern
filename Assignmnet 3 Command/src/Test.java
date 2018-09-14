class Test {

	@org.junit.jupiter.api.Test
	void testMKeyListener() {
		
		RemoteControl remoteControl = new RemoteControl();
		
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
		
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
		remoteControl.offButtonWasPushed(2);
		remoteControl.offButtonWasPushed(3);
		remoteControl.offButtonWasPushed(4);
		
	}

}
