package com.pula.authorizedonly.dao;

import org.springframework.stereotype.Repository;

import com.pula.authorizedonly.dto.User;

@Repository
public class UserDao {
	public User getUser(String username) {
		User user = new User();
		System.out.println("username "+username);
		if ("naveen".equals(username)) {
			user.setUsername("naveen");
			user.setPassword("naveen");
			user.setRole("ROLE_ADMIN");
		} else {
			user = null;
		}
		return user;
	}
}
