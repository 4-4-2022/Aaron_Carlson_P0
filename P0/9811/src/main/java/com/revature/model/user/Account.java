package com.revature.model.user;


public class Account {
	double AccountBalance;
	int Transactions; 
	String[] AuthorizedUsers; 
	int AuthorizedUserAmount;
	String[] GamesPlayed;
	int NumGamesPlayed;
	 int RewardsPoints;
	 public static int AccountCount;
	public Account() {
		super();
		AccountCount++;
	}
	

	
	public Account(double AccountBalance, int Transactions, String[] AuthorizedUsers, int AuthorizedUserAmount, String[] GamesPlayed, int NumGamesPlayed,
 int RewardsPoints) {
		
		AccountBalance = this.AccountBalance;
		Transactions = this.Transactions; 
		AuthorizedUsers = this.AuthorizedUsers; 
	    AuthorizedUserAmount = this.AuthorizedUserAmount;
		GamesPlayed = this.GamesPlayed;
		NumGamesPlayed = this.NumGamesPlayed;
		RewardsPoints = this.RewardsPoints;
	}

 public double getAccountBalance() {
	return AccountBalance;
} public int getAuthorizedUserAmount() {
	return AuthorizedUserAmount;
}public String[] getGamesPlayed() {
	return GamesPlayed;
}public int getRewards() {
	return RewardsPoints;
}public int getTransactions() {
	return Transactions;
}public int NumGamesPlayed() {
	return NumGamesPlayed;
}public String[] AuthorizedUsers() {
	return AuthorizedUsers;
}

public void setAccountBalance(double AccountBalance) {
	    AccountBalance = this.AccountBalance;
}public void setAuthorizedUserAmount(int AuthorizedUserAmount) {
		AuthorizedUserAmount = this.AuthorizedUserAmount;
}public void setGamesPlayed(String[] GamesPlayed) {
	    GamesPlayed = this.GamesPlayed;
}public void setRewardsPoints(int RewardsPoints) {
	   RewardsPoints = this.RewardsPoints;
}public void setTransactions(int Transactions) {
	   Transactions = this.Transactions;
}public void SetNumGamesPlayed(int NumGamesPlayed) {
	   NumGamesPlayed = this.NumGamesPlayed;
}
}