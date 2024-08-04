package com.metro.connect.controller;

import com.metro.connect.dto.CommonApiResponse;
import com.metro.connect.dto.UserListResponseDto;
import com.metro.connect.dto.UserLoginRequest;
import com.metro.connect.dto.UserLoginResponse;
import com.metro.connect.entity.User;
import com.metro.connect.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user/")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	private UserResource userResource;
	

	@PostMapping("/register")
	public ResponseEntity<CommonApiResponse> registerUser(@RequestBody User user) {
		return userResource.registerUser(user);
	}
	
	@PostMapping("login")	
	public ResponseEntity<UserLoginResponse> login(@RequestBody UserLoginRequest userLoginRequest) {
		return userResource.login(userLoginRequest);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<UserListResponseDto> fetchUser(@RequestParam("userId") int userId) {
		return userResource.getUserDetailsById(userId);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<CommonApiResponse> deleteUser(@RequestParam("userId") int userId) {
		return userResource.deleteUser(userId);
	}
	
	// UserRegisterDto, we will set only email, password & role  from UI
	@PostMapping("/admin/register")
	public ResponseEntity<CommonApiResponse> registerAdmin(@RequestBody User user) {
		return userResource.registerAdmin(user);
	}
	
	@PutMapping("/update")
	public ResponseEntity<CommonApiResponse> updateUser(@RequestBody User user) {
		return userResource.updateUser(user);
	}
	
	@GetMapping("/fetch/all")
	public ResponseEntity<UserListResponseDto> fetchAllUsers(@RequestParam("role") String role) {
		return userResource.getAllUsers(role);
	}

}
