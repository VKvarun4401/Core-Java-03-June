class Myntra
{
	static long mobileNum;
	static String emailId;
	static String uName;
	static String pass;

	public static boolean createMyntraAccount(long mobileNumber, String email, String userName, String password)
	{
		System.out.println("Myntra Account Creation Process Is Started..");
		boolean isMyntraAccountCreated = false;
		boolean isMobileNum = false;
		boolean isEmailId = false;
		boolean isUserName = false;
		boolean isPass = false;
		
		
		if(mobileNumber > 0){
			mobileNum = mobileNumber;
			isMobileNum = true;
			isMyntraAccountCreated = true;
			System.out.println("Mobile Number Varification Is Successfull.");
			
			
		}else{
			System.out.println("Please Enter Valid Mobile Number.");
			return isMobileNum;
		}
		
		if(email != null){
			emailId = email;
			isEmailId = true;
			isMyntraAccountCreated = true;
			System.out.println("Email Id Varifiction Is Successfull.");
			
			
		}else{
			System.out.println("Please Enter Valid Email Id.");
			return isEmailId;
		}
		
		if(userName != null){
			uName = userName;
			isUserName = true;
			isMyntraAccountCreated = true;
			System.out.println("User Name Varification Is Successfull.");
			
		}else{
			System.out.println("Please Enter Valid User Name.");
			return isUserName;
		}
		
		if(password != null){
			pass = password;
			isPass = true;
			isMyntraAccountCreated = true;
			System.out.println("Password Varification Is Successfull.");
			
		}else{
			System.out.println("Please Enter Valid Password");
			return isPass;
		}
		
		
		System.out.println("Myntra Account Creation Process Is Ended..");
		
		return isMyntraAccountCreated;
	}
	
	public static void getMyntraAccountDetails()
	{
		System.out.println("Mobile Number : " + mobileNum);
		System.out.println("Email Id : " + emailId);
		System.out.println("User Name : " + uName);
		System.out.println("Password : " + pass);
		return;
	}

}