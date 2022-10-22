package com.javaexpress.Accounts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.Accounts.Repository.AccountsRespository;
import com.javaexpress.Accounts.model.Accounts;
import com.javaexpress.Accounts.model.Customer;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AccountsController {

	@Autowired
	private AccountsRespository accountsRespository;
	
	@PostMapping("/myAccount")
	public void fetchAccountDetails( ) {
		Iterable<Accounts> findAll = accountsRespository.findAll();
		
	}
}
