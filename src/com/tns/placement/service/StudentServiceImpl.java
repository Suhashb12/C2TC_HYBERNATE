package com.tns.placement.service;

import com.tns.placement.entities.Student;
import com.tns.placement.repository.StudentRepo;
import com.tns.placement.repository.StudentRepoImpl;

public class StudentServiceImpl implements StudentService{

	private StudentRepo repo;
	public StudentServiceImpl()
	{

	repo = new StudentRepoImpl();
	}
	@Override
	public void addStudent(Student student) {
	repo.beginTransaction();
	repo.addStudent(student);
	repo.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
	repo.beginTransaction();
	repo.updateStudent(student);
	repo.commitTransaction();
	}
	@Override
	public void searchStudentById(long id) {
	repo.beginTransaction();
	repo.searchStudentById(id);
	repo.commitTransaction();
	}
	//@Override
	//public void searchStudentByHallTicket(long ticketNo) {
		//repo.beginTransaction();
		//repo.searchStudentById(ticketNo);
		//repo.commitTransaction();
		//}
	
	@Override
	public  boolean deleteStudent(long id)  {
		repo.beginTransaction();
		repo.deleteStudent(id);
		repo.commitTransaction();
		return true;
		}
	
		
}
