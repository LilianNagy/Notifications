package Messages;

public class TaskEmail implements TaskAdded{

	@Override
	public String prepareMessage(String[] placeHolders) {
		return "by email:Task 1 added ";
	}

	@Override
	public void addTeamDescription() {
		//code to add team description
	}

}
