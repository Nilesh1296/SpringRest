package com.bridgeit.LoginRegistration.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.LoginRegistration.service.UserService;
import com.bridgeit.LoginRegistration.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserService userservice;
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public int save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user.getId();
	}

	@Override
	public User get(int id) {
		
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	/*@Override
	public String login(User user) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	/*@Override
	public String login(User user) {
	
		User user2=new User();
		
	if(	user.getName().equals(user2.getName()))
	{
		return  user2.getName();
	}
	else
		return 0;
	}*/

}
