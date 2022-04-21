package com.revature.mavenstart;



import java.util.DuplicateFormatFlagsException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.HomePageUI.AccountUI;
import com.revature.HomePageUI.EmployeeUI;
import com.revature.UIwelcome.WelcomeUI;
import com.revature.connectdb.ConnectDb;
import com.revature.model.user.Username;
import com.revature.repo.UserFailsafe;
import com.revature.repo.UsernameInterface;

public class Greeting {


	

	public static String NewUser;
	public static String u;

	public static void main(String[] args) {



		String Greet= "WELCOME!!!!!! Greetings, customer. Welcome to Fysh Rewards Game Center.";
		String BeenHereBefore = "Please Select from the following options:" + "\n"+ " If you have an account Type the number '1'."
				+ "\n"+ "Otherwise if you would like to set up an account with us please type the number '2'.";

        
		System.out.println(Greet);

		System.out.println(BeenHereBefore);

		Scanner scanner = new Scanner(System.in);
		boolean isUserDone = true;
		ConnectDb.getConnection();
		while (isUserDone) {
			int userSelection =WelcomeUI.handleUserSelection(scanner);
			switch (userSelection) {
			case 1:
				
				System.out.println("Great Please Enter your User Name");
			     u = scanner.nextLine();
			     if(u == null) {
			    	 u = "WELCOME";
			     };
			    	 
			   try {

					 System.out.println("Great Please Enter your Password");
					 String P = scanner.nextLine();


					 System.out.println("Checking validation.........");

				//code

					System.out.println("login Successful");
					scanner.nextLine();
					AccountUI.AccountUI();
				}
				//else
					//System.out.println("Username and password not found");
				   // isUserDone = true;

				catch(InputMismatchException e) {
					System.out.println("Sorry, that username could not be found.");


				}
				break;
			case 2:
				System.out.println("Ok, Lets Get you signed up. Choose your username");
				//Case2 options to be Created
				
					NewUser = scanner.nextLine();
					if(NewUser ==null) {
						NewUser = "WELCOME";
					}
					
				try {
				System.out.println("Choose a password");
		       
				String NewPass = scanner.nextLine();
				
				System.out.println("Saving information......"
						+ "press enter");}
				catch (InputMismatchException e) {
					System.out.println("error code:2 switch, reloading");
				}
				scanner.nextLine();
				AccountUI.AccountUI();
				
				
		
			

			  
	
					
				break;
			case 3:
				System.out.println("employee login");
                scanner.nextLine();
                EmployeeUI.EmployeeUI();
                break;
                
			}
		System.out.println("coming soon");
		Greeting.main(args);
		scanner.close();
			}
	}}
	
		

