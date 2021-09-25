package Question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(1425767,5000,"Ramesh");
		try
		{
			Transaction.withdraw(a1,4001);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("After transaction Balance is "+a1.getAccountBalance());
	}

}