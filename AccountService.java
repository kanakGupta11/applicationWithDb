package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import antlr.collections.List;

	public class AccountService {
		@Autowired
		AccountRepository accountRepository;
		public void saveAccount(Accounts account) {
			accountRepository.save(account);
			System.out.println(account);
			}
		public java.util.List<Accounts> getAccount() {
			return accountRepository.findAll();		
		}
}
