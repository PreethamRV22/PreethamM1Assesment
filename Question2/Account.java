package Question2;

import java.time.LocalDate;

class Account {
	private long accountNumber;
	private double accountBalance;
	LocalDate openedDate;
	private String accountHolderName;
	public Account(int accountNumber, double accountBalance,String accountHolderName) { 
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}
	public Account(int accountNumber, double accountBalance, LocalDate openedDate,String accountHolderName) { 
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.openedDate = openedDate;
		this.accountHolderName = accountHolderName;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = validateAccountNumer(accountNumber);
	}
	
	private long validateAccountNumer(long accountNumber){
		return (accountNumber >=100000) ? accountNumber : 100000;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = validateAccountBalance(accountBalance);
		if(accountBalance==0)
			System.out.println("Enter minimum balance of 5000");
	}
	
	private double validateAccountBalance(double accountBalance2) {
		if(accountBalance>5000) return accountBalance;
		return 0;
	}

	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = validateOpenedDate(openedDate);
	}

	private LocalDate validateOpenedDate(LocalDate openedDate) {
		return  LocalDate.now();
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = validateAccountHolderName(accountHolderName);
	}
	
	private String validateAccountHolderName(String accountHolderName) { 
		return (accountHolderName.length() > 0) ? accountHolderName : "Enter valid name";
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public LocalDate getOpenedDate() {
		return openedDate;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String toString() {
		return "Account Number: "+accountNumber+"\nAccount Balance: "+accountBalance+"\nOpened Date: "+openedDate+"\nAccount Holder Name: "+accountHolderName;
	}
}
