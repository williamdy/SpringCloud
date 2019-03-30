package com.sugon.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hi {
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/")
	public String hi(){
		return "hi " + port;
	}
	
}
