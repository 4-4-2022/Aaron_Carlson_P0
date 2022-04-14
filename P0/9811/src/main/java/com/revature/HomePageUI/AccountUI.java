package com.revature.HomePageUI;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.UIwelcome.WelcomeUI;
import com.revature.model.user.Username;

public class AccountUI {
public static void AccountUI() {
	
	Username username = new Username();
	
	System.out.println("Hello (usernamehere) Here are your Homepage options, Select the number you wish to use" + "\n"+
	"1. Account balance and profile" + "\n"+
	"2. Load/Withdraw balance" + "\n" +
	"3. View your transactions" + "\n"+
	"4. View Last Games played" + "\n"+
	"5. Authorized Users" + "\n"+
	"6. Rewards Points and prizes " + "\n"); 
	Scanner scanner = new Scanner(System.in);
	boolean MenuHome = true;
	while(MenuHome) {
		int userSelection =WelcomeUI.handleUserSelection(scanner);
		switch(userSelection) {
		  case 1:
		    // code block
		    break;
		  case 2:
		    // code block
		    break;
		  case 3:
		  // code block
			break;
		  case 4:
	      // code block
		    break;
		  case 5:
	      // code block
		    break;
		  case 6:
		  // code block
		    break;
		    
		  default:
		    // code block
		}

}
 

}
}

