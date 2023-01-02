package com.tns.placement.service;

import com.tns.placement.entities.User;

public interface UserService {
	public abstract void addNewUser(User user);
	public abstract void updateUser(User user);
	public abstract void login(User user);
	public abstract boolean logOut();
}
