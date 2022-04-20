package com.revature.fyshroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.HomePageUI.AccountUI;
import com.revature.UIwelcome.WelcomeUI;

public class Games {



	public static void main(String[] args) {
		System.out.println("Welcome to the Fysh Room");
		   System.out.println("Choose from the following games:");
      List<String> games = new ArrayList<>();
      games.add("Rooster Coup");
      games.add("Dyno Blast");
      games.add("Anti Baccarat");
      games.add("AR Fish Shot");

      System.out.println("1 for RoosterCoop" + "\n"+ "2 for Dyno Blast" +
      "\n" + "3 for Anti Baccarat" +"\n"+ "4 for AR Fish shot"+ "\n"+ "5."
      		+ "Go Back");

	Scanner scanner = new Scanner(System.in);
	boolean showGames = true;
	while(showGames){


	int userSelection =WelcomeUI.handleUserSelection(scanner);
       switch(userSelection){

       case 1: System.out.println("1. " + games.get(0));
       break;
       case 2: System.out.println("2. " + games.get(1));
       break;
       case 3: System.out.println("3. "+ games.get(2));
       break;
       case 4: System.out.println("4. "+ games.get(3));
       break;
       case 5: AccountUI.AccountUI();


}
}
}}