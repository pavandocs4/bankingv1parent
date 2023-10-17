package com.banking.main.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.banking.main.user.entity.User;

@Component
public interface UserService {
	public User saveUser(User user);
	public List<User> getAllUsers();
}
