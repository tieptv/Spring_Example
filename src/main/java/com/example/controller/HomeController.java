package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import com.example.service.AccountServiceImp;

@Controller
public class HomeController {
	@Autowired
	AccountServiceImp service;

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String showHome(Map<String, Object> model) {
		return "MainPage";
	}

	@RequestMapping(value = { "/home" }, method = RequestMethod.POST)
	public String login(@RequestParam String email, @RequestParam String pwd, @RequestParam String status,
			Model model) {
		Account acc = new Account();
		acc.setEmail(email);
		acc.setPassword(pwd);
		List<Account> list = service.findByEmailAndPassword(email, pwd);
		if ("login".equals(status)) {
			if (list.size() == 1) {
				list = service.getAll();
				model.addAttribute("accountList", list);
				return "redirect:/account";
			}

			else
				return "MainPage";
		} else {
			if (list.size() == 1)
				return "MainPage";
			else {
				service.insert(acc);
				list = service.getAll();
				model.addAttribute("accountList", list);
				return "ListAccount";

			}

		}

	}
}
