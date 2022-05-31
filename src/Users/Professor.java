package Users;

import java.sql.Date;

import Course.Course;

public class Professor extends Users{

	Date hirringDate;
	String PhdTopic;

	public Professor(Course crs){
	      this.crs = crs;
	      this.crs.attach(this);
	}

	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhdTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhdTopic = phDTopic;
	}
	
	@Override
	public void update() {

		
	}
}
