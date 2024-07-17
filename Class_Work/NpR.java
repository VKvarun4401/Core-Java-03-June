class NpR
{
	public static void main(String npr[])
	{
		System.out.println("Main Method Started");
		//nPr = n!/(n-r)!
		int factNumber = 8;
		int numThing = 3;
		
		
		//int nPr = Factorial.getFact(factNumber)/Factorial.getFact(Factorial.totalNumberOfThings(factNumber, numThing));
		int nPr = Factorial.getFact(factNumber)/Factorial.getFact(factNumber-numThing);
		
		
		System.out.println("The final result is " + nPr);
		System.out.println("Main Method Ended");
	}
	
}