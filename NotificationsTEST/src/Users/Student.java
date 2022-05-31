package Users;

import Course.Course;

public class Student extends Users{
	
	int id;
	
	public Student(Course crs){
	      this.setCrs(crs);
	      this.getCrs().attach(this);
	}
	public Student(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void update() {
		//update Student with course announcements 
	}
	
}
