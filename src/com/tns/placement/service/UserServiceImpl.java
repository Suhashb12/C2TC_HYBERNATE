package com.tns.placement.service;

import com.tns.placement.entities.User;
import com.tns.placement.repository.UserRepo;
import com.tns.placement.repository.UserRepoImpl;


public class UserServiceImpl implements UserService {
	private UserRepo repo;

	public UserServiceImpl()
	{

	repo = new UserRepoImpl();
	}
	@Override
	public void addNewUser(User user) {
		repo.beginTransaction();
		repo.addNewUser(user);
		repo.commitTransaction();
		
	}

	@Override
	public void updateUser(User user) {
		repo.beginTransaction();
		repo.updateUser(user);
		repo.commitTransaction();
		
	}

	@Override
	public void login(User user) {
		repo.beginTransaction();
		repo.login(user);
		repo.commitTransaction();
		
	}

	@Override
	public boolean logOut() {
		repo.beginTransaction();
		repo. logout();
		repo.commitTransaction();
		return false;
	}

}
