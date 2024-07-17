class AirConditioner
{
	static boolean isConnected;
	static int currentTemperature;
	static int minTemperature;
	static int maxTemperature = 6;

	public static void onOrOff()
	{
		System.out.println("onOrOff started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("AirConditioner Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("AirConditioner Turned off");
		}
		System.out.println("onOrOff ended");
		return;
	}
	
	public static void increaseTemperature()
	{
		System.out.println("increaseTemperature() started");
		if(isConnected == true)
		{
			if(currentTemperature < maxTemperature)
			{
				currentTemperature = currentTemperature + 1;
				System.out.println("The current Temperature is " + currentTemperature);
			}else
			{
				System.out.println("Max Temperature Reached");
			}
		}else
		{
			System.out.println("Gubee... Ac na On Maadu...");
		}
		
		System.out.println("increaseTemperature() ended");
		return ;
		
	}
	
	public static void productDetails()
	{
		String name = "AirConditioner";
		double price = 10000.0;
		System.out.println("productDetails started");
		System.out.println("The Brand Name is : " + name);
		System.out.println("The Brand price is : " + price);
		
		System.out.println("productDetails ended");
	}


}