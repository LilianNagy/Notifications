package Messages;

public class MessageFactory implements ObjectFactory {

	@Override
	public DailyNews createDailyNews() {
		
		return new DailyNewsSMS();
	}

	@Override
	public GradesAnnouncement createAnnouncment() {
		
		return new GradesAnnouncementSMS();
	}

	@Override
	public TaskAdded createTask() {
		
		return new TaskAddedSMS();
	}

}
