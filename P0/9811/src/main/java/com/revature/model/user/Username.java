package com.revature.model.user;

public class Username {
	String User;
    String Password;
    int Balance;
    String authUser;

    public static int UsernameCount;



    public Username(String User, String Password, int Balance, String authUser) {

		//This is always implied to be the first line of any constructor.
		super();
		UsernameCount++;




		this.Password = Password;
		this.Balance =Balance;
		this.authUser= authUser;


	}
    public void setUser(String User) {
    	this.User = User;
}public void setPassword(String Password) {
	this.Password = Password;
}public void setBalance(int Balance) {
	this.Balance =Balance;
}public void setAuthUser(String authUser) {
	this.authUser= authUser;
}

    public String getUser() {
    	return User;
    } public String getAuthUser() {
    	return authUser;
    }
    public String getPassword() {
    	return Password;
    }
    public int getBalance() {
    	return Balance;
    }
	public static void add(Username username) {
		
		
	}
	


}
