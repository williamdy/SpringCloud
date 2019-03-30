package com.sugon.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.bo.User;


@RestController
public class Hi {
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/")
	public String hi(){
		return "hi " + port;
	}
	
	@GetMapping("/userdemo")
	public User userdemo(){
		 String id = "hi " + port;
		 String name = "user" + port;
		 User user = new User();
		 user.setId(id);
		 user.setName(name);
		 return user;
	}
	
	@GetMapping("/getuserbyid")
	public User getuserbyid(@RequestParam String id){
//		 String id = "hi " + port;
		 String name = "user" + port;
		 User user = new User();
		 user.setId(id);
		 user.setName(name);
		 return user;
	}
}
