public class SearchOffCommand implements Command {
	Search search;

	public SearchOffCommand (Search search) {
		this.search = search;
	}

	public void execute() {
		search.up();
	}
}