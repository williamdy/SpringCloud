package com.sugon.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.common.bo.User;

@RestController
public class Hi {
	
	@Autowired
	RestTemplate rt;
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/")
	public String hi(){
		return "hi " + port;
	}
	
	@GetMapping("/getuserbyid")
	public User getuserbyid(@RequestParam String id){
//		RestTemplate rt = new RestTemplate();
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id", id);
		User user = rt.getForObject("http://REST-SERVER/getuserbyid?id={id}", User.class, map);
		return user;
	}
	
}
