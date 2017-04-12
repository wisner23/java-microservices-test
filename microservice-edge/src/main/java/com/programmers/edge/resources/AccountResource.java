package com.programmers.edge.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountResource {

	@RequestMapping(method=RequestMethod.GET)
	public String getHelloWorld(){
		return "Hello World!";
	}
}
