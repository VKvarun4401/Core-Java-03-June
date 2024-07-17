class ZomatoRunner
{
	public static void main(String zom[])
	{
		double foodName = Zomato.takeOrder("Singapore Chicken");
		double foodName1 = Zomato.takeOrder("Lemon Chicken");
		double foodName2 = Zomato.takeOrder("Mutton Roast Semi Gravy");
		double foodName3 = Zomato.takeOrder("Chicken Kabab");
		double foodName4 = Zomato.takeOrder("Paneer Chilli");
		double foodName5 = Zomato.takeOrder("Mutton Pepper Dry");
		System.out.println("Singapore Chicken Price is " + foodName);
		System.out.println("Lemon Chicken Price is " + foodName1);
		System.out.println("Mutton Roast Semi Gravy Price is " + foodName2);
		System.out.println("Chicken Kabab Price is " + foodName3);
		System.out.println("Paneer Chilli Price is " + foodName4);
		System.out.println("Mutton Pepper Dry Price is " + foodName4);
	
	}


}