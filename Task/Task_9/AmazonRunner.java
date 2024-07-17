class AmazonRunner
{

	public static void main(String ama[])
	{
		boolean isAmazonValidation = Amazon.createAmazonAccount("Abhi","vkvarun4401@gmail.com","VA4402",null);
		if(isAmazonValidation == true){
			Amazon.getAmazonAccountDeatils();
		}else{
			System.out.println("Please Enter Correct Information.");
		}
	}

}