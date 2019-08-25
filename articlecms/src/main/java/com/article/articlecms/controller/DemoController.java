package com.article.articlecms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.article.articlecms.Idao.IUsersDAO;
import com.article.articlecms.entity.Users;

/**
 * @author jayant
 *
 */
@RestController
public class DemoController {


	@Autowired
	private Environment environment;

	@Autowired
	private IUsersDAO UsersDAO;
	
	@RequestMapping(value = "/hallo/{name}", method = RequestMethod.GET)
	public String sayhi(@PathVariable String name) {
		return "Hallo <h2> " + name + "</h1>";
	}
	
	@GetMapping("users/{userId}")
	public ResponseEntity<Users> getUserById(@PathVariable("userId") Integer userId) {
		Users user = UsersDAO.getUsersById(userId.intValue());
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public String createUser(@Valid @RequestBody Users user) {
		UsersDAO.addUser(user);
		return "";
	}
}
