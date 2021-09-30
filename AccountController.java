package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	ArrayList<Accounts> accountList = new ArrayList<Accounts>();
	@GetMapping("/accountlist")
	ArrayList<Accounts>getAllUserDetails() {
		return accountList;
	}
	@GetMapping("/all")
	java.util.List<Accounts> getUsers() {
		return accountService.getAccount();}
	@GetMapping("/{name}")
	public Accounts getAccount(@PathVariable String name) {
		
		System.out.println(name);
		for(Accounts account : accountList) {
			System.out.println(account.getOwnername() + " -- ");
			if(account.getOwnername().equals(name))
				return account;
		}
		
		System.out.println("Acccount Not found");
		return null;
	}
	
	@PostMapping("/addaccount")
	public String addAccount(@RequestBody Accounts account) {
//		if(account.equals(null))
//			return "Cannot enter null values";
		
		//accountList.add(account);
		accountService.saveAccount(account);
		return "Account successfully added !";
	}
}
