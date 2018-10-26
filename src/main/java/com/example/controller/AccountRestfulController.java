package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AccountResfulService;
import com.example.service.ServiceResult;

@RestController
@RequestMapping("/account")
public class AccountRestfulController {
	@Autowired
	private AccountResfulService service;

	@GetMapping("/")
	public ResponseEntity<ServiceResult> findAllAccount() {
		return new ResponseEntity<ServiceResult>(service.findAll(),HttpStatus.OK);
	}

}
