class Passport
{
	static String cprl;
	static int dcdrl;
	static String surN;
	static String giveN;
	static String dateOfBirth;
	static String emailId;
	static boolean isELS;
	static String loginI;
	static String pd;
	static String conPwd;
	static String hintQ;
	static String hintA;
	public static boolean createPassport(String cprLocation, int dcdrLocation, String surName, 
	String giveName, String dob, String email, boolean isEmailLoginSame, 
	String loginId, String pwd, String confirmPwd, String 
	hintQues, String hintAns)
	{
		System.out.println("Passport Creation started...");
		
		boolean isPassportDataCreated = false;
		if(dcdrLocation > 0 && surName != null && giveName != null && email != null && pwd != null && confirmPwd != null && hintQues != null && hintAns != null){
			System.out.println("Validation Successfull.");
			cprl = cprLocation;
			dcdrl = dcdrLocation;
			surN = surName;
			giveN = giveName;
			dateOfBirth = dob;
			emailId = email;
			isELS = isEmailLoginSame;
			loginI = loginId;
			pd = pwd;
			conPwd = confirmPwd;
			hintQ = hintQues;
			hintA = hintAns;
			isPassportDataCreated = true;
			System.out.println("Passport Created.");
		}else{
			System.out.println("Please Provide....dcdrLocation/surName/giveName/email/pwd/confirmPwd/hintQues/hintAns");
		}
		
		System.out.println("Passport Creation ended.");
		return isPassportDataCreated;
	}
	
	public static void getPassportDetails()
	{
		System.out.println("Passport Data fetch started...");
		System.out.println("Person cprLocation : " + cprl);
		System.out.println("Person dcdrLocation : " + dcdrl);
		System.out.println("Person surName : " + surN);
		System.out.println("Person giveName : " + giveN);
		System.out.println("Person dob : " + dateOfBirth);
		System.out.println("Person email : " + emailId);
		System.out.println("Person isEmailLoginSame : " + isELS);
		System.out.println("Person loginId : " + loginI);
		System.out.println("Person pwd : " + pd);
		System.out.println("Person confirmPwd : " + conPwd);
		System.out.println("Person hintQues : " + hintQ);
		System.out.println("Person hintAns : " + hintA);
		System.out.println("Passport Data fetch ended...");
		
		return;
	}


}