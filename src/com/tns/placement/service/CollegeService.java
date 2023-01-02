package com.tns.placement.service;

import com.tns.placement.entities.College;
import com.tns.placement.entities.Placement;

public interface CollegeService {
	public abstract void addCollege(College college);
	public abstract void updateCollege(College college);
	public abstract void searchCollege(long id);
	public abstract boolean deleteCollege(long id);
	public abstract boolean schedulePlacement(Placement placement);
}
