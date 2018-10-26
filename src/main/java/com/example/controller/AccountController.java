package com.example.controller;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Account;
import com.example.service.AccountServiceImp;



@Controller
public class AccountController {
//	@Autowired
//	AccountServiceImp service;
//
//	@PostMapping("/account/edit")
//	@ResponseBody
//	public String editAccount(@RequestParam String id, @RequestParam String email, @RequestParam String pass) {
//		Account c = new Account();
//		c.setId(Integer.parseInt(id));
//		c.setEmail(email);
//		c.setPassword(pass);
//		String new_pass = service.update(c);
//		if ("false".equals(new_pass))
//			return "false";
//		else
//			return new_pass;
//	}
//
//	@PostMapping("/account/delete")
//	@ResponseBody
//	public String deleteAccount(@RequestParam String id) {
//		 int Id=Integer.parseInt(id);
//         boolean flag=service.delete(Id);
//         return String.valueOf(flag);
//	}
//
//	@GetMapping("/account")
//	public String listAccount(Model model) {
//		List<Account> list = service.getAll();
//		model.addAttribute("accountList", list);
//		return "ListAccount";
//	}

}
