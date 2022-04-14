package com.revature.model.user;

import java.util.List;

public class Username {
	String User;
    String Password;
    
    public static int UsernameCount;
    
	
	
    public Username() {
		//This is always implied to be the first line of any constructor.
		super();
		UsernameCount++;
	}
	public Username(String User, String Password) {
		
		this.User = User;
		this.Password = Password;
		UsernameCount++;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
