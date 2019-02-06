package com.in28minutes.login;

public class LoginService {

	public boolean validateUser(String user, String password) {
		return user.equals("in28minutes") 
				&& password.equals("dummy");
	}
}
