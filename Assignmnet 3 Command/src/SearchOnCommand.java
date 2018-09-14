public class SearchOnCommand implements Command {
	Search search;

	public SearchOnCommand (Search search) {
		this.search = search;
	}

	public void execute() {
		search.up();
	}
}