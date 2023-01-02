package com.tns.placement.repository;

import com.tns.placement.entities.Student;

//+addStudent(Student student) : Student

//+updateStudent(Student student) : Student

//+searchStudentById(long id):Student

//+searchStudentByHallTicket(long ticketNo) :
//Student

//+deleteStudent(long id):boolean
public interface StudentRepo {
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void  searchStudentById(long id);
	//public abstract void searchStudentByHallTicket(long ticketNo);
	public abstract  boolean deleteStudent(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}
