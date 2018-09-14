public class CampOnCommand implements Command {
	Camp camp;

	public CampOnCommand(Camp camp) {
		this.camp = camp;
	}
	public void execute() {
		camp.high();
	}
}