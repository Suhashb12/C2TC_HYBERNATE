package com.tns.placement.repository;

import com.tns.placement.entities.College;
import com.tns.placement.entities.Placement;

public interface CollegeRepo {


	public abstract void addCollege(College college);
	public abstract void searchCollege(long id);
	public abstract boolean deleteCollege(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	public abstract void schedulePlacement(Placement placement);

}
