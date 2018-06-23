package com.bridgeit.LoginRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.LoginRegistration.dao.UserDao;
import com.bridgeit.LoginRegistration.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	 private UserDao userdao;


	@Override
	public int save(User user) {
		return userdao.save(user);
	}

	@Override
	public User get(int id) {
		return userdao.get(id);
	}
	
}
