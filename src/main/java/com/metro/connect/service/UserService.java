package com.metro.connect.service;

import com.metro.connect.entity.User;

import java.util.List;

public interface UserService {
	
	User registerUser(User user);
	User updateUser(User user);
	User getUserById(int userId);
	User getUserByEmailAndPassword(String email, String password);
	User getUserByEmailAndPasswordAndRole(String email, String password, String role);
	User getUserByEmail(String email);
	User getUserByEmailAndRole(String email, String role);
	List<User> getUsersByRoleAndStatus(String role, int status);
	
}
