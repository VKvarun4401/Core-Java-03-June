class MyntraRunner
{
	public static void main(String myn[])
	{
		boolean isMyntraValidationAccount = Myntra.createMyntraAccount(8987440194L, "vkvarun4401@gmail.com", null, "vkAbhi4401");
		if(isMyntraValidationAccount == true){
			Myntra.getMyntraAccountDetails();
		}else{
			System.out.println("Please Enter Valid Information.");
		}
	}

}