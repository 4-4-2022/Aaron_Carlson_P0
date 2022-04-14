package com.revature.HomePageUI;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.UIwelcome.WelcomeUI;
import com.revature.model.user.Account;
import com.revature.model.user.Username;

public class AccountUI {
public static void AccountUI() {
	
    
	Username username = new Username();
	Account account = new Account();
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
		scanner.nextInt();
		switch(userSelection) {
		  case 1:
		   
		    	double eAcc = account.getAccountBalance();
		    	System.out.println(""+ eAcc);
		    try {
		    	scanner.nextInt();
		    }
		    catch(InputMismatchException e) {
				System.out.println("Sorry,invalid option.");
		    }
		    break;
		  case 2:
			  System.out.println("To load your account type Load followed by the amount" + "\n"+
			  "to Withdraw followed by the amount. To withdraw all your funds you can also type 'Withdraw Max'");
			  //CODE FOR WITHDRAW AND LOAD
			   try {
			    	scanner.nextInt();
			    }
			    catch(InputMismatchException e) {
					System.out.println("Sorry,invalid option.");
			    }
			   break;
		  case 3:
			  int etran = account.getTransactions();
			  System.out.println(""+ etran);
			  try {
			    	scanner.nextInt();
			    }
			    catch(InputMismatchException e) {
					System.out.println("Sorry,invalid option.");
			    }
			break;
		  case 4:
			  try {
			    	scanner.nextInt();
			    }
			    catch(InputMismatchException e) {
					System.out.println("Sorry,invalid option.");
			    }
		    break;
		  case 5:
			  try {
			    	scanner.nextInt();
			    }
			    catch(InputMismatchException e) {
					System.out.println("Sorry,invalid option.");
			    }
		    break;
		  case 6:
			  try {
			    	scanner.nextInt();
			    }
			    catch(InputMismatchException e) {
					System.out.println("Sorry,invalid option.");}
			  
		    break;
		    
		  default:
		    // code block
		}
		

}

	}

}


