package com.bridgeit.LoginRegistration.dao;

import com.bridgeit.LoginRegistration.model.User;

public interface UserDao
{
 public int save(User user);
 public User get(int id);
 //public String login(User user);
}
