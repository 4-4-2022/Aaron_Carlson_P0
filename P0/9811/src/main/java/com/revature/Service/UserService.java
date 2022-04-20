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

	/*
	 * We have introduced Logback into our project in order to log events that occur in our application. We will log these events
	 * to a file that we can refer to later to track the events that are occurring in our application. These events can include exceptions
	 * that have been thrown, information about what types of data users have requested, and user transactions.
	 * 
	 * Because we used Maven to download the jar file for Logback and add it to our classpath, we already have access to Logback-specific
	 * classes.
	 */
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