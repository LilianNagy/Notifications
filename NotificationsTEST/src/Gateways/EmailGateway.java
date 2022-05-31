package Gateways;

import Messages.DailynewsEmail;
import Messages.GradesEmail;
import Messages.TaskEmail;

public class EmailGateway implements Gateway{
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailynewsEmail) {
			DailynewsEmail dailyNewsEmailMessage = (DailynewsEmail) message;
			
			dailyNewsEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesEmail) {
			GradesEmail announcementEmailMessage = (GradesEmail) message;
			
			announcementEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskEmail) {
			TaskEmail addedEmailMessage = (TaskEmail) message;
			
			addedEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message by email to user
		}
		
	}
}
