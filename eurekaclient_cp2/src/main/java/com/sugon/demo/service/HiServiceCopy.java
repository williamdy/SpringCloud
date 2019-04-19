package com.sugon.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.common.bo.User;

@FeignClient(url = "http://localhost:8082/",name = "REST-CLIENT")
public interface HiServiceCopy {
	@RequestMapping(method = RequestMethod.GET, value = "/getuserbyid")
	public User hi(@RequestParam(value = "id") String id);
}
