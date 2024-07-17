class PassportRunner
{

	public static void main(String pass[])
	{
		boolean isCreatedPassportValidation = Passport.createPassPort("PO", 14, "vk", "avi", "05/07/2002", "avbk4401@gmail.com", 
		true, "avbk4401", "avbk4401", "avbk4401", "Color", "Black", "abvcf12");
		
		if(isCreatedPassportValidation == true){
			Passport.getPassPortDetails();
			
		}
	
	}
}