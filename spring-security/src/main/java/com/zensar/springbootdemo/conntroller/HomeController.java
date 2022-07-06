package com.zensar.springbootdemo.conntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// http://localhost:8080/all
	@GetMapping("/all")
	public String sayHello() {
		return "<h2> Hello !!!! </h2>";

	}

	// http://localhost:8080/admin
	@GetMapping("/admin")
	public String helloAdmin() {
		return "<h2> Hello Admin !!!! </h2>";

	}

	// http://localhost:8080/user
	@GetMapping("/user")
	public String helloUser() {
		return "<h2> Hello User !!!! </h2>";

	}
}