package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.IUserService;
import com.app.pojos.User;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	IUserService userService;

	@PostConstruct
	public void init() {
		System.out.println("In User Controller");
	}
	
	
//@GetMapping("/login")
//public String Hello()
//{
//	return ("Hello");
//}

@PostMapping("/login")
public ResponseEntity<?> validateUser(@RequestBody User u)
{
	System.out.println("in validate user");
	try {
		u=userService.validateUser(u.getEmail(),u.getPassword());
		return new ResponseEntity<User>(u,HttpStatus.OK);
			
	}catch (Exception e) {
		return new ResponseEntity<String>("User Invalid",HttpStatus.OK);
	}
}

//public ResponseEntity<?> registerUser(@RequestBody User u)
//{
//	System.out.println("in register user" +u);
//	
//	try {
//		userService.register(u);
//		return new ResponseEntity<String>("Registered successfully",HttpStatus.OK);
//		
//	}catch (Exception e) {
//		e.printStackTrace();
//		return new ResponseEntity<String>("Not registered",HttpStatus.OK);
//	}
//	}
//}

}
