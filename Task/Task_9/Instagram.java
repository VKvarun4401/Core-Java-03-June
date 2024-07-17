class Instagram
{
	static String emailId;
	static long mobileNum;
	static String fName;
	static String uName;
	static String pass;

	public static boolean createInstagramAccount(String email, long mobileNumber, String fullName, String userName, String password)	
	{
		System.out.println("Instagram Account creation is started..");
		boolean isInstagramAccountCreated = false;
		boolean isEmailId = false;
		boolean isMobileNumber = false;
		boolean isFullName = false;
		boolean isUserName = false;
		boolean isPassword = false;
		
		System.out.println("Instagram Account Varification is started.");
		if(email != null){
			emailId = email;
			isEmailId = true;
			isInstagramAccountCreated=true;
			
		}else{
			System.out.println("Please provide Correct Email Id.");
			return isEmailId;
		}
		
		
		if(mobileNumber > 0){
			mobileNum = mobileNumber;
			isMobileNumber = true;
			isInstagramAccountCreated=true;
			
		}else{
			System.out.println("Please Provide Correct Mobile Number.");
			return isMobileNumber;
		}
		
		if(fullName != null){
			fName = fullName;
			isFullName = true;
			isInstagramAccountCreated=true;
		}else{
			System.out.println("Please Provide Correct Full Name.");
			return isFullName;
		}
		
		if(userName != null){
			uName = userName;
			isUserName = true;
			isInstagramAccountCreated=true;
		}else{
			System.out.println("Please Enter Correct User Name.");
			return isUserName;
		}
		
		if(password != null){
			pass = password;
			isPassword = true;
			isInstagramAccountCreated=true;
		}else{
			System.out.println("Please Enter Correct Password.");
			return isPassword;
		}
		
		System.out.println("Instagram Account creation is ended..");
		return isInstagramAccountCreated;
		
	}
	public static void getInstagramDetails(){
		System.out.println("Email Id Is : " + emailId);
		System.out.println("Mobile Number Is : " + mobileNum);
		System.out.println("Full Name Is : " + fName);
		System.out.println("User Name Is : " + uName);
		System.out.println("Password Is : " + pass);
		return;
	}

}