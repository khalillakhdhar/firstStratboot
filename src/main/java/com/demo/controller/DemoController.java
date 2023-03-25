package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;

@RestController //annotation
// exécution sous localhost:8080
public class DemoController {
List<User> users=new ArrayList<User>();
	@GetMapping("hello")
	// afficher sous l'adresse ocalhost:8080/hello le retour de ma méthode
	public String sayHello()
	{
		return "<h1>hello spring</h1>";
	}
	@GetMapping("user")
	public String getUser()
	{
		User u=new User("test", "testeur");
		return u.toString();
		
	}
	@PostMapping("user")
	public List<User> AddUser(User user)
	{
		users.add(user);
		return users;
		
	}
}
