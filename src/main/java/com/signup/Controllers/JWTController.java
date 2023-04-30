package com.signup.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		String text = "this is a private page";
		return text;
	}

}
