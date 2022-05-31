package Messages;

public interface ObjectFactory {
	
    DailyNews createDailyNews();
    GradesAnnouncement createAnnouncment();
    TaskAdded createTask();
}
