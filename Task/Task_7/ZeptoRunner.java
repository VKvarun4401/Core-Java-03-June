class ZeptoRunner
{
	public static void main(String foo[])
	{
		double foodName = Zepto.takeOrder("Chocolate");
		double foodName1 = Zepto.takeOrder("Pink Pop Lemon Tea");
		double foodName2 = Zepto.takeOrder("Oat Aren Frappe");
		double foodName3 = Zepto.takeOrder("Strawberry Jasmine S...");
		double foodName4 = Zepto.takeOrder("Strawberry Jasmine T...");
		double foodName5 = Zepto.takeOrder("Mutton Pepper Dry");
		System.out.println("Chocolate Price is " + foodName);
		System.out.println("Pink Pop Lemon Tea Price is " + foodName1);
		System.out.println("Oat Aren Frappe Price is " + foodName2);
		System.out.println("Strawberry Jasmine S... Price is " + foodName3);
		System.out.println("Strawberry Jasmine T... Price is " + foodName4);
		System.out.println("Lasagna Flatbrad Price is " + foodName4);
	
	}

}