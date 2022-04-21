package com.revature.HomePageUI;

import java.util.Scanner;

import com.revature.UIwelcome.WelcomeUI;
import com.revature.mavenstart.Greeting;

public class ProfileUI {

	public static void ProfileUI() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean MenuHome = true;
		while(MenuHome) {
			int userSelection =WelcomeUI.handleUserSelection(scanner);
             System.out.println("TO EDIT YOUR PROFILE" + "\n" + "1. edit personal info" + "\n"
			+ "2. edit Email address" + "\n"+ "3. 2 factor auth"+ "\n" + "4. logout");
			switch(userSelection) {
			  case 1:
                     
				 System.out.println(" name: ");
			    break;
			
			  case 2:
				  System.out.println("email: default@default.com, Change?");	
					

				   break;
			  case 3:
				  System.out.println("Set up 2factor?");	
					

				break;
	        
			case 4: 
				Greeting.main(null);
		        break;}
		}
	}
}
			
		