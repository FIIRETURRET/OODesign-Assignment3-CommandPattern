public class CampOffCommand implements Command {
	Camp camp;

	public CampOffCommand(Camp camp) {
		this.camp = camp;
	}
	public void execute() {
		camp.off();
	}
}