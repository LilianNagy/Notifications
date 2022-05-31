package Users;

import Course.Course;

public class TA extends Users {
  
	public TA(Course crs){
	      this.crs = crs;
	      this.crs.attach(this);
	}
	@Override
	public void update() {
		
	}
	
}
