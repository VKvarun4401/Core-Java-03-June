class SwiggyRunner
{
	public static void main(String swi[])
	{
		String foodName = "Vada";
		double resFoodName = Swiggy.takeOrder(foodName, 2);
		
		System.out.println(foodName + " price is : " + resFoodName);
	
	}

}