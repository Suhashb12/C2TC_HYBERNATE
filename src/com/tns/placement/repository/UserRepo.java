package com.tns.placement.repository;


import com.tns.placement.entities.User;

public interface UserRepo {
	public abstract void addNewUser(User user);
	public abstract void updateUser(User user);
	public abstract void  login(User user);
	public abstract boolean  logout();
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
