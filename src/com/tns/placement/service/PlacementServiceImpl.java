package com.tns.placement.service;

import com.tns.placement.entities.Placement;
import com.tns.placement.repository.PlacementRepo;
import com.tns.placement.repository.PlacementRepoImpl;

public  class PlacementServiceImpl implements PlacementService {
	private PlacementRepo repo;
	public PlacementServiceImpl()
	{
		repo = new PlacementRepoImpl();
	}
	@Override
	public void addPlacement(Placement placement) {
	repo.beginTransaction();
	repo.addPlacement(placement);
	repo.commitTransaction();
	}
	@Override
	public void updatePlacement(Placement placement) {
	repo.beginTransaction();
	repo.updatePlacement(placement);
	repo.commitTransaction();
	}
	@Override
	public void searchPlacement(long id) {
	repo.beginTransaction();
	repo.searchPlacement(id);
	repo.commitTransaction();
	}
	@Override
	public boolean cancelPlacement(long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
