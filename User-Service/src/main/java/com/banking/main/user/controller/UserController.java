package com.banking.main.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.main.user.entity.User;
import com.banking.main.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(path="/userservice/saveuser")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		User savedUser= userService.saveUser(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping(path="/userservice/getallusers")
	public ResponseEntity<?> getAllUsers(){
		List<User> savedUsers= userService.getAllUsers();
		return new ResponseEntity<List<User> >(savedUsers,HttpStatus.CREATED);
	}
}
