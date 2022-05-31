package Course;

import java.util.ArrayList;
import java.util.List;

import Users.Users;

public class Course {
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	List<Users> users = new ArrayList<>();
	String state;

	   public Course(String name, String code) {
			super();
			this.name = name;
			this.code = code;
			
			announcements = new ArrayList<>();
			exams = new ArrayList<>();
			grades = new ArrayList<>();
			
		}
	 
	   public void attach(Users user){
	      users.add(user);		
	   }
	   
	   public void deattach(Users user){
		      users.remove(user);		
		   }
	
	   public void notifyAllUsers(){
		      for (Users user : users) {
		        user.update();
		      }
	   }
	public void addAnnouncements(String assignName) {
		announcements.add(assignName);
		
		// do some logic here 
		
		notifyAllUsers();
	}
	

	public void addExam(String examName) {
		exams.add(examName);
		
		// do some logic here 
		
		notifyAllUsers();
	}
	public void addGrades(String grade) {
		grades.add(grade);

		// do some logic here 
		
		notifyAllUsers();
	}
	
	public List<String> getAnnouncements () {
	      return  announcements;
	   }
	
	public List<String> getExams () {
	      return  exams;
	   }
	public List<String> getGrades () {
	      return  grades;
	   }
	
	
	
	
}
