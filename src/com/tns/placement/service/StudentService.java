package com.tns.placement.service;

import com.tns.placement.entities.Student;

//+addStudent(Student student) : Student

//+updateStudent(Student student) : Student

//+searchStudentById(long id):Student

//+searchStudentByHallTicket(long ticketNo) :
//Student

//+addCertificate(Certificate certificate):
//Boolean

//+updateCertificate(Certificate certificate):
//Boolean

//+deleteStudent(long id):boolean
public interface StudentService {
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void searchStudentById(long id);
	//public abstract void searchStudentByHallTicket(long ticketNo);
	//public abstract boolean addCertificate(Certificate certificate);
	//public abstract boolean updateCertificate(Certificate certificate);
	public abstract boolean deleteStudent(long id);
	
}