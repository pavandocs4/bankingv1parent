package com.banking.main.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.main.user.entity.User;
import com.banking.main.user.repository.UserRepository;
import com.banking.main.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		try {
			User savedUser = userRepository.save(user);
			return user;
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public List<User> getAllUsers() {
		try {
			List<User> savedUsers = userRepository.findAll();
			return savedUsers;
		} catch (Exception e) {
			throw e;
		}

	}

}
