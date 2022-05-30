package Messages;

public class GradesAnnouncementSMS implements GradesAnnouncement {

	@Override
	public String prepareMessage(String[] placeHolders) {
		
		return "Grades Announcement SMS";
	}

	@Override
	public boolean verifyGrades() {
		
		return false;
	}

}
