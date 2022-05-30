package Messages;

public class Message {
 private DailyNews news; 
 private GradesAnnouncement grades; 
 private TaskAdded task; 
 
 public Message(ObjectFactory factory) {
	 
	 news=factory.createDailyNews();
	 grades=factory.createAnnouncment();
	 task=factory.createTask();
 }
 
	public String prepareMessage(String[] placeHolders) {
		
		news.prepareMessage(placeHolders);
		grades.prepareMessage(placeHolders);
		task.prepareMessage(placeHolders);
		
		return null;
		
		
		
	}
}
