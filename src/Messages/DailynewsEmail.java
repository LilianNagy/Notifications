package Messages;

public class DailynewsEmail implements DailyNews  {

	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		
		return "Daily news email" ;
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}

	
}
