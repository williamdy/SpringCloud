package com.sugon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.bo.User;
import com.sugon.demo.service.HiService;
import com.sugon.demo.service.HiServiceCopy;


@RestController
public class Hi {
	
	@Value("${server.port}")
	String port;
	
	 @Autowired
	 private HiService hiService;
	
	 @Autowired
	 private HiServiceCopy hiServiceCopy;
	 
	@GetMapping("/")
	public String hi(){
		return "hi " + port;
	}
	
	@GetMapping("/getuserbyid")
	public User getuserbyid(@RequestParam String id){
		User user = hiService.hi(id);
		return user;
	}
	
	@GetMapping("/getuserbyidcopy")
	public User getuserbyidcopy(@RequestParam String id){
		User user = hiService.hi(id);
		return user;
	}
}
