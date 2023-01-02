package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.cg.jpacrudop.dao.JPAUtil;
import com.tns.placement.entities.College;
import com.tns.placement.entities.Placement;

public class CollegeRepoImpl  implements CollegeRepo{

	private EntityManager entityManager;
	public CollegeRepoImpl() {
	entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public void addCollege(College college) {
	entityManager.persist(college);
	}
	@Override
	public void  searchCollege(long id) {
	entityManager.merge(id);
	}
	@Override
	public boolean  deleteCollege(long id) {
	entityManager.merge(id);
	return true;
	}
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}
	@Override
	public void schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		
	

}}
