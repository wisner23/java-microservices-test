package com.programmers.account.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.programmers.account.models.Account;
import com.programmers.account.services.interfaces.AccountService;

/**
 * @author wisner.oliveira
 * 
 */

@RestController
@RequestMapping(value="/account")
public class AccountResource {
	
	
	private AccountService service;

	@Autowired
	public AccountResource(AccountService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Account> getAccounts() {
		return service.getAccounts();
	}

}
