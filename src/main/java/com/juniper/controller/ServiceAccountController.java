package com.juniper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juniper.service.ServiceAccountService;

@RestController
public class ServiceAccountController {

	@Autowired
	private ServiceAccountService serv;
	
	@GetMapping(value="/createAccount",produces = "application/json")
	public Object createserviceAccount(){
		
		return new ResponseEntity<Object>(serv.createServiceAccount(),HttpStatus.OK);
		
	}
}
