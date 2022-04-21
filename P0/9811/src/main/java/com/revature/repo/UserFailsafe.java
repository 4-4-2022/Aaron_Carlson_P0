package com.revature.repo;

import java.util.Set;
import java.util.TreeSet;

import com.revature.model.Cupcake;
import com.revature.model.user.Username;

public class UserFailsafe implements UsernameInterface {
	public Set<Username> usernames = new TreeSet<>();
	
	
	
	public UserFailsafe() {
		super();
		
		this.usernames.add(new Username("User1","Pass1", 2999, "Son1"));
		this.usernames.add(new Username("User2", "Pass2", 204, "Daughter2"));
		this.usernames.add(new Username("User3", "Pass3", 1, "Daughter3"));
		this.usernames.add(new Username("User4", "Pass4", 200, "ThisGuy4"));
		
	}
	
	
	

	
	public Set<Username> findAllUsername() {
		return this.usernames;
	}
	@Override
    public Username findUser(String user) {
		for(Username username : usernames) {
			if(username.getUser().equalsIgnoreCase(user)) {
				return username;
			}
		}
		return null;    		
    }
	@Override
	public Username findUserpass(String Password) {
		
		for(Username username : usernames) {
			if(username.getPassword().equalsIgnoreCase(Password)) {
				return username;
			}
		}
		return null;
	}

	@Override
	public Username findUserBalance(int Balance) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
	public Username findUserAuth(String AuthUser) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void save(Username User) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void update(Username User) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void delete(Username User) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void saveP(Username Password) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void updateP(Username Password) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteP(Username Password) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void saveB(Username Balance) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void updateB(Username Balance) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteB(Username Balance) {
		// TODO Auto-generated method stub
		
	}
	
	
}

