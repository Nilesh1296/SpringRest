package com.bridgeit.LoginRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bridgeit.LoginRegistration.service.UserService;
import com.bridgeit.LoginRegistration.model.User;

@RestController
public class RegistrationController {

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> save(@RequestBody User user) {
		userservice.save(user);
		return new ResponseEntity<String>("New Book has been saved with ID:", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/save/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> get(@PathVariable("id") int id)
	{
	      User user = userservice.get(id);
	      if (user == null) 
	         {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	          }
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
}
