package com.revature.HomePageUI;

import java.util.Scanner;

import com.revature.UIwelcome.WelcomeUI;
import com.revature.fyshroom.Games;
import com.revature.model.user.Account;

public class AccountUI {
public static void AccountUI() {



	Account account = new Account();
	System.out.println("Hello (usernamehere) Here are your Homepage options, Select the number you wish to use" + "\n"+
	"1. Account balance and profile" + "\n"+
	"2. Load/Withdraw balance" + "\n" +
	"3. View your transactions" + "\n"+
	"4. ENTER THE FYSHROOM" + "\n"+
	"5. Authorized Users" + "\n"+
	"6. Rewards Points and prizes " + "\n"+
	"7. Return to the Main Menu");
	Scanner scanner = new Scanner(System.in);
	boolean MenuHome = true;
	while(MenuHome) {
		int userSelection =WelcomeUI.handleUserSelection(scanner);

		switch(userSelection) {
		  case 1:

		    	double eAcc = account.getAccountBalance();
		    	System.out.println(""+ eAcc);

		    break;
		  case 2:
			  System.out.println("To load your account type Load followed by the amount" + "\n"+
			  "to Withdraw followed by the amount. To withdraw all your funds you can also type 'Withdraw Max'");
			  //CODE FOR WITHDRAW AND LOAD

			   break;
		  case 3:
			  int etran = account.getTransactions();
			  System.out.println(""+ etran);

			break;
		  case 4:

				   System.out.println("Lets dive in!");
				   Games.main(null);



		    break;
		  case 5: System.out.println("Authorized Users: ");

		    break;
		  case 6: System.out.println("Rewards ");

		    break;
		  case 7: AccountUI.AccountUI();
		  default:
			  System.out.println("Hello (usernamehere) Here are your Homepage options, Select the number you wish to use" + "\n"+
						"1. Account balance and profile" + "\n"+
						"2. Load/Withdraw balance" + "\n" +
						"3. View your transactions" + "\n"+
						"4. ENTER THE FYSHROOM" + "\n"+
						"5. Authorized Users" + "\n"+
						"6. Rewards Points and prizes " + "\n"+
						"7. Return to main Menu");

		}


}

	}

}


