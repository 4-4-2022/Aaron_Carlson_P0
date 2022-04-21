package com.revature.Service;

import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.model.user.Username;
import com.revature.repo.UserFailsafe;
import com.revature.repo.UsernameInterface;
import com.revature.repo.UserRepo;

public class UserService {

	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	private UserRepo userRepo;
	
	public UserService() {
		this.userRepo = new UserRepo();
	}

	public Set<Username> findAllUsername(Scanner scanner){
		Set<Username> retrievedUsernames = null;
		String userPassword = scanner.nextLine();
		String[] AuthUsers = AuthUser.length(",");
		retrievedUsernames = findUser(Scanner scanner);
		
		logger.info("The retrieved usernames are: " + retrievedUsernames);
		return retrievedUsernames;
	}
}