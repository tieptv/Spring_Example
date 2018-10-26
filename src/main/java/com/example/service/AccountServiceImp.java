package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Account;
import com.example.repository.AccountRepository;



@Service
@Transactional
public class AccountServiceImp implements AccountService {
	
	@Autowired
	AccountRepository repo;



	@Override
	public boolean insert(Account a) {
		try {
			repo.save(a);
			return true;
		   }
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public String update(Account a) {
		try {
			repo.save(a);
			return a.getPassword();
		   }
		catch(Exception e)
		{
			return "false";
		}
	}

	@Override
	public boolean delete(int a) {
		try {
			repo.deleteById(a);
			return true;
		   }
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<Account> getAll() {
		List<Account> list=(List<Account>) repo.findAll();
		return list;
	}

	@Override
	public List<Account> findByEmailAndPassword(String email, String password) {
		List<Account>list=repo.findByEmailAndPassword(email, password);
		return list;
	}



}
