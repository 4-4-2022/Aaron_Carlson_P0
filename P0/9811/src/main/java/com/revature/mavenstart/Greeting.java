package com.revature.mavenstart;



import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.HomePageUI.AccountUI;
import com.revature.UIwelcome.WelcomeUI;
import com.revature.model.user.Username;

public class Greeting {

	public static void main(String[] args) {
		
		String Greet= "Greetings, customer. Welcome to Fysh Rewards Game Center.";
		String BeenHereBefore = "Please Select from the following options:" + "\n"+ " If you have an account Type the number '1'."
				+ " "+ "\n"+ "Otherwise if you would like to set up an account with us please type the number '2'.";
				
		System.out.println(Greet);
		
		System.out.println(BeenHereBefore);
		
		Scanner scanner = new Scanner(System.in);
		boolean isUserDone = true;
		
		while (isUserDone) {
			int userSelection =WelcomeUI.handleUserSelection(scanner);

			switch (userSelection) {
			case 1:
				System.out.println("Great Please Enter your User Name");
				//Case1 additional options to be Created.
				try {
					 String U = scanner.nextLine();
					 System.out.println("Great Please Enter your Password");
					 String P = scanner.nextLine();
						 
					 System.out.println("Checking validation.........");
				
				Username username = new Username();
				
				//if(U == username.getUser() && P == username.getPassword()){
					System.out.println("login Successful");
					scanner.nextLine();
					AccountUI.AccountUI();
				//}
				//else 
					//System.out.println("Username and password not found");
				   // isUserDone = true;
				}
				catch(InputMismatchException e) {
					System.out.println("Sorry, that username could not be found.");
				}
				
				
				break;
			case 2:
				System.out.println("Ok, Lets Get you signed up. Choose your username");
				//Case2 options to be Created
				try {
					userSelection = scanner.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Sorry, that username is taken.");
				break;
			
			}
		}
		scanner.close();
		}
		
		
		
	}

	private static void FindUser() {
		// TODO Auto-generated method stub
		
	}
	}

