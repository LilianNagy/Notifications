package Messages;

public class EmailFactory implements ObjectFactory {

	@Override
	public DailyNews createDailyNews() {
		
		return new DailynewsEmail();
	}

	@Override
	public GradesAnnouncement createAnnouncment() {
		
		return new GradesEmail();
	}

	@Override
	public TaskAdded createTask() {
		
		return new TaskEmail();
	}

}
