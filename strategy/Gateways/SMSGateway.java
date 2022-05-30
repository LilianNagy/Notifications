package Gateways;

import Messages.DailyNewsSMS;
import Messages.GradesAnnouncementSMS;
import Messages.TaskAddedSMS;

public class SMSGateway implements Gateway{
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsSMS) {
			DailyNewsSMS msg = (DailyNewsSMS) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementSMS) {
			GradesAnnouncementSMS msg = (GradesAnnouncementSMS) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedSMS) {
			TaskAddedSMS msg = (TaskAddedSMS) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message to user
		}
		
	}
}
