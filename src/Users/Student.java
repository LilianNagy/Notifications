package Users;

import Course.Course;

public class Student extends Users{
	
	int id;
	
	public Student(Course crs){
	      this.crs = crs;
	      this.crs.attach(this);
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
		
	}
	
}
