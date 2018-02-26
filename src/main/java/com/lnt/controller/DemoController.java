package com.lnt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public ResponseEntity defaultMapping() {

		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/test")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
