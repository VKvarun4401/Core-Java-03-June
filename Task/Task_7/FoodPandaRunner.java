class FoodPandaRunner
{
	public static void main(String foo[])
	{
		double foodName = FoodPanda.takeOrder("Chocolate");
		double foodName1 = FoodPanda.takeOrder("Pink Pop Lemon Tea");
		double foodName2 = FoodPanda.takeOrder("Oat Aren Frappe");
		double foodName3 = FoodPanda.takeOrder("Strawberry Jasmine S...");
		double foodName4 = FoodPanda.takeOrder("Strawberry Jasmine T...");
		double foodName5 = FoodPanda.takeOrder("Mutton Pepper Dry");
		System.out.println("Chocolate Price is " + foodName);
		System.out.println("Pink Pop Lemon Tea Price is " + foodName1);
		System.out.println("Oat Aren Frappe Price is " + foodName2);
		System.out.println("Strawberry Jasmine S... Price is " + foodName3);
		System.out.println("Strawberry Jasmine T... Price is " + foodName4);
		System.out.println("Lasagna Flatbrad Price is " + foodName4);
	
	}

}