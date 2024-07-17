class Bottle
{
	static String bottleId = "BTEYF7";
	static String brandName = "CocaCola";
	static String bottleColor = "White";
	static String bottleType[] = {"Glass bottle", "Wine bottle", "Codd-neck bottle", "Aluminium bottle", "Hot water bottle"}; 
	static int storageCapacity = 500;
	
	public static void main(String bottle[])
	{
		System.out.println("Bottle Id : " + bottleId);
		System.out.println("Bottle Brand Name : " + brandName);
		System.out.println("Bottle Color : " + bottleColor);
		System.out.println("Bottle Storage Capacity : " + storageCapacity);
		for(int bot = 0 ; bot <= (bottleType.length) - 1 ; bot++)
		{
			System.out.println("Bottle Types : " + bottleType[bot]);
		}
		System.out.println(" ");
		
	
	}

}