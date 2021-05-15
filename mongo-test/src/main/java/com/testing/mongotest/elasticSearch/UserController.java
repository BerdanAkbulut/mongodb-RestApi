package com.testing.mongotest.elasticSearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.mongotest.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/elasticuser")
public class UserController {
		
	
	private final UserRepository userRepository;
	
	@GetMapping("/list")
	public ResponseEntity<Iterable<com.testing.mongotest.elasticSearch.User>> getAll() {
		Iterable<com.testing.mongotest.elasticSearch.User> users = userRepository.findAll();
		return ResponseEntity.ok(users);
	}
	
	@PostMapping("/add")
	public ResponseEntity<com.testing.mongotest.elasticSearch.User> add(@RequestBody com.testing.mongotest.elasticSearch.User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}
}
