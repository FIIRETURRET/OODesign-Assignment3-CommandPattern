
public class StereoWithCDCommand implements Command{

	Stereo stereo;
	
	public StereoWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
}
