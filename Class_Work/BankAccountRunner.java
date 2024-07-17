class BankAccountRunner
{
	public static void main(String bank[])
	{
		BankAccount.credit(0);
		
		
		
		double totalAmount = BankAccount.getBalance();
		System.out.println("The Closing Blance is :" + totalAmount);
		
	}

}