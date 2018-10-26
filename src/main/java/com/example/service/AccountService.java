package com.example.service;

import java.util.List;

import com.example.entity.Account;



public interface AccountService {
	boolean insert(Account a);
	String update(Account a);
	boolean delete (int a);
	List<Account> getAll();
	List<Account>findByEmailAndPassword (String email, String password);
}
