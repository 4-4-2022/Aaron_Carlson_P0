package com.revature.model.user;

import java.util.Set;

import com.revature.repo.UsernameInterface;

public class Employee implements UsernameInterface {
	public static void main(String userName, String Password, boolean isAdmin) {

		if (isAdmin) {
        
		}

	}

	@Override
	public Set<Username> findAllUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Username findUser(String User) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Username findUserpass(String Password) {
		// TODO Auto-generated method stub
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
