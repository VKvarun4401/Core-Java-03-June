class Amazon
{
	static String uName;
	static String emailId;
	static String pass;
	static String reEnterPass;
	public static boolean createAmazonAccount(String userName, String email, String password, String reEnterPassword)
	{
		System.out.println("Amazon Account Creation Process Is Started..");
		boolean isCreatedAmazonAccount = false;
		boolean isUName = false;
		boolean isEmailId = false;
		boolean isPassword = false;
		boolean isReEnterPassword = false;
		if(userName != null){
			uName = userName;
			isUName = true;
			isCreatedAmazonAccount = true;
			System.out.println("User Name Validation Is Successful.");
		}else{
			System.out.println("Please Enter Valid User Name.");
			return isUName;
		}
		
		if(email != null){
			emailId = email;
			isEmailId = true;
			isCreatedAmazonAccount = true;
			System.out.println("Email Id Validation Is Successful.");
		}else{
			System.out.println("Please Enter Valid Email Id.");
			return isEmailId;
		}
		
		if(password != null){
			pass = password;
			isPassword = true;
			isCreatedAmazonAccount = true;
			System.out.println("Password Validation Is Successful.");
		}else{
			System.out.println("Please Enter Valid Password.");
			return isPassword;
		}
		
		if(reEnterPassword != null){
			reEnterPass = reEnterPassword;
			isReEnterPassword = true;
			isCreatedAmazonAccount = true;
			System.out.println("Re-Enter Password Validation Is Successful.");
		}else{
			System.out.println("Please Enter Valid Re-Enter Password.");
			return isReEnterPassword;
		}
		
		
		System.out.println("Amazon Account Creation Process Is Started..");
		return isCreatedAmazonAccount;
	}
	public static void getAmazonAccountDeatils()
	{
		System.out.println("User Name : " + uName);
		System.out.println("Email Is : " + emailId);
		System.out.println("User Name : " + pass);
		System.out.println("User Name : " + reEnterPass);
		
		
		return;
	}
}