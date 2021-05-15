package com.testing.mongotest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public ResponseEntity<User> add(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> listAll() {
		return ResponseEntity.ok(userRepository.findAll());
	}
}
