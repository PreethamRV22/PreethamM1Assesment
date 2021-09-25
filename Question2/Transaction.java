package Question2;

public class Transaction
{
	public static double deposit(Account account,double amount )
	{
		return 0;
	}
	public static double withdraw(Account account,double amount)
	{
		double balance = account.getAccountBalance();
		if(balance-amount >= 5000)
		return balance-amount;
		else
			throw new InsufficientBalanceException(balance-amount+" is not sufficinet as min Deposit");
	}
}