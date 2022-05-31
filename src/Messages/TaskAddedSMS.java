package Messages;

public class TaskAddedSMS implements TaskAdded  {
	
	
	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		return "Task Added SMS";
	}


	@Override
	public void addTeamDescription() {
		
	}
}
