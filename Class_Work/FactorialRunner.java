class FactorialRunner
{
	public static void main(String fact[])
	{
		int factNumber = 6;
		System.out.println("main method started");
		int finalValue = Factorial.getFact(6);
		System.out.println("Factorial value of " + factNumber + " is " + finalValue);
		System.out.println("main method ended"); 
	}

}