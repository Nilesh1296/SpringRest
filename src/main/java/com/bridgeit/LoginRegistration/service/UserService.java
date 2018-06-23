package com.bridgeit.LoginRegistration.service;

import com.bridgeit.LoginRegistration.model.User;

public interface UserService
{
	public int save(User user);
	public User get(int id);
}
