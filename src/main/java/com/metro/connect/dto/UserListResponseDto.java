package com.metro.connect.dto;

import com.metro.connect.entity.User;

import java.util.List;

public class UserListResponseDto extends CommonApiResponse {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
