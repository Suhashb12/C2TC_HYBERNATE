package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Student;


public class StudentRepoImpl implements StudentRepo{
	private EntityManager entityManager;
	public StudentRepoImpl() {
	entityManager = JPAUtil.getEntityManager();

}
	@Override
	public void addStudent(Student student) {
	entityManager.persist(student);
	}
	@Override
	public void updateStudent(Student student) {
	entityManager.merge(student);
	}
	@Override
	public  void searchStudentById(long id) {
		((StudentRepoImpl) entityManager).searchStudentById(id);
	}
	//@Override
	//public  void searchStudentByHallTicket(long ticketNo) {
	//	((StudentRepoImpl) entityManager).searchStudentByHallTicket(ticketNo);
	//}
	@Override
	public boolean deleteStudent(long id)  {
		return ((StudentRepoImpl) entityManager).deleteStudent(id);
	}
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}
}
