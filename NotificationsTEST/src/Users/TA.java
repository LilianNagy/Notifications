package Users;

import Course.Course;

public class TA extends Users {
  
	public TA(Course crs){
	      this.setCrs(crs);
	      this.getCrs().attach(this);
	}
	@Override
	public void update() {
		//update TA with course announcements 
	}
	
}
