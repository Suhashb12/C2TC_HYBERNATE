package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Placement;


public class PlacementRepoImpl implements PlacementRepo {
	private EntityManager entityManager;
	public PlacementRepoImpl() {
	entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addPlacement(Placement placement) {
	entityManager.persist(placement);
	}
	@Override
	public void  updatePlacement(Placement placement) {
	entityManager.merge(placement);
	}
	@Override
	public void searchPlacement(long id) {
	entityManager.merge(id);
	}
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}}