package com.samplecrud.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping
	public String getSample() {
		return "Spring Boot";
	}
}
