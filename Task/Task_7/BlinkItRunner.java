class BlinkItRunner
{

	public static void main(String zom[])
	{
		double foodName = BlinkIt.takeOrder("Singapore Chicken");
		double foodName1 = BlinkIt.takeOrder("Lemon Chicken");
		double foodName2 = BlinkIt.takeOrder("Mutton Roast Semi Gravy");
		double foodName3 = BlinkIt.takeOrder("Chicken Kabab");
		double foodName4 = BlinkIt.takeOrder("Paneer Chilli");
		double foodName5 = BlinkIt.takeOrder("Mutton Pepper Dry");
		System.out.println("Singapore Chicken Price is " + foodName);
		System.out.println("Lemon Chicken Price is " + foodName1);
		System.out.println("Mutton Roast Semi Gravy Price is " + foodName2);
		System.out.println("Chicken Kabab Price is " + foodName3);
		System.out.println("Paneer Chilli Price is " + foodName4);
		System.out.println("Mutton Pepper Dry Price is " + foodName4);
	
	}
}
