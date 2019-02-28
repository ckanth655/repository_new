package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public List<UserRecord> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public void addUser(@RequestBody UserRecord user) {
		userService.addUser(user);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public Optional<UserRecord> getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
}
