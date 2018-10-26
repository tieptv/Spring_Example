package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.AccountRepository;

@Service
public class AccountResfulService {
	@Autowired
	AccountRepository repo;

	public ServiceResult findAll() {
          ServiceResult result=new ServiceResult();
          result.setData(repo.findAll());
          return result;
	}
	

}
