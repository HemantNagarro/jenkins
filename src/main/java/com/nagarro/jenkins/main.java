package com.nagarro.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class main {
	
	@GetMapping("/jenkins")
	public String Jenkins() {
		return "Hello Jenkins";
	}

}
