package com.tns.placement.client;


import com.tns.placement.entities.College;
import com.tns.placement.entities.Placement;
import com.tns.placement.entities.Student;
import com.tns.placement.entities.User;
import com.tns.placement.service.CollegeService;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.PlacementService;
import com.tns.placement.service.PlacementServiceImpl;
import com.tns.placement.service.StudentService;
import com.tns.placement.service.StudentServiceImpl;
import com.tns.placement.service.UserService;
import com.tns.placement.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		student.setId(9);
		student.setName("ravi");
		student.setCollege("Siet");
		student.setRoll(101);
		student.setQuali("BE");
		student.setCourse("Cse");
		//student.setHallTickectNo(101);
		student.setYear(2023);
		service.addStudent(student);
		
		PlacementService service1= new PlacementServiceImpl();
		Placement placement =new Placement();
		placement.setId(3);
		placement.setName("suma");
		placement.setCollege("BIT");
		placement.setLocalDate(null);
		placement.setQuali("BE");
		placement.setYear(2024);
		service1.addPlacement(placement);
		
		CollegeService service2= new CollegeServiceImpl();
		
		College college = new College();
		college.setCollegeName("SIET");
		college.setId(3);
		college.setLocation("Tumkur");
		service2.addCollege(college);
		
		UserService service3= new UserServiceImpl();
		
		User user=new User();
		user.setId(4);
		user.setName("ram");
		user.setType("normal");
		user.setPassword("ravi@1234");
		service3.addNewUser(user);
}
}