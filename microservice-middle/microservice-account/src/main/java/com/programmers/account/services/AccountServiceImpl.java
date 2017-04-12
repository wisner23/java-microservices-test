package com.programmers.account.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.programmers.account.models.Account;
import com.programmers.account.services.interfaces.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public List<Account> getAccounts() {
		
		Account ac1 = new Account("Wisner", BigDecimal.TEN);
		Account ac2 = new Account("Maria", BigDecimal.valueOf(123));
		
		return Arrays.asList(ac1,ac2);
	}

}
