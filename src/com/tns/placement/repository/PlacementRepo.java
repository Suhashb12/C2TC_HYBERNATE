package com.tns.placement.repository;

import com.tns.placement.entities.Placement;

public interface PlacementRepo {
	public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract void searchPlacement(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
