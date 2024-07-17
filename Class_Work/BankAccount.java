class BankAccount
{
	static double balance;
	
	public static void debit(double amount)
	{
		if(amount <= balance) balance = balance - amount;
		else System.out.println("Insufficient Balance.");
		return;
	}
	public static void credit(double amount)
	{
		if(amount > 0) balance = balance + amount;
		else System.out.println("Amount be Zero.");
		return;
	}
	public static double getBalance()
	{
		return balance;
	}
}