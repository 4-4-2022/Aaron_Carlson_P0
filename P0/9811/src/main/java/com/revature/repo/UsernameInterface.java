package com.revature.repo;

import java.util.Set;

import com.revature.model.user.Username;


public interface UsernameInterface {
	public Set<Username> findAllUsername();
	public Username findUser(String User);
	public Username findUserpass(String Password);
	public Username findUserBalance(int Balance);
	public Username findUserAuth(String AuthUser);
	public void save(Username User);
	public void update(Username User);
	public void delete(Username User);
	public void saveP(Username Password);
	public void updateP(Username Password);
	public void deleteP(Username Password);
	public void saveB(Username Balance);
	public void updateB(Username Balance);
	public void deleteB(Username Balance);








}
