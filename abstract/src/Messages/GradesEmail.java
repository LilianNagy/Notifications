package Messages;

public class GradesEmail implements GradesAnnouncement {

	@Override
	public String prepareMessage(String[] placeHolders) {
		
		return "Grades Announcement Email";
	}

	@Override
	public boolean verifyGrades() {
		
		return false;
	}

}
