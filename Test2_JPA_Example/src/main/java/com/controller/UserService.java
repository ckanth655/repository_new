package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepositary userRepositary;

	public List<UserRecord> getAllUsers() {

		List<UserRecord> userRecords = new ArrayList<>();

		userRepositary.findAll().forEach(userRecords::add);

		return userRecords;
	}

	public Optional<UserRecord> getUser(String id) {
		return userRepositary.findById(id);
	}

	public void addUser(UserRecord userRecord) {
		userRepositary.save(userRecord);
	}

	public void delete(String id) {
		userRepositary.deleteById(id);
	}
}
