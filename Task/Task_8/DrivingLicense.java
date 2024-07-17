class DrivingLicense
{

	static String demoDetails;
	static int add;
	static String giveN;
	static String gend;
	static String dob;
	static String mobileN;
	static String emailI;
	static long addhaar;
	public static boolean createDrivingLicenseRunner(String demographaicDetails, int address, String giveName, String gender, 
	String dob, String mobileNumber, String emailId, long aadhaarNumber)
	{
		boolean isAadhaarDataCreated = false;
		demoDetails = demographaicDetails;
		add = address;
		giveN = giveName;
		gend = gender;
		dob = dob;
		mobileN = mobileNumber;
		emailI = emailId;
		addhaar = aadhaarNumber;
		return isAadhaarDataCreated;
	}
	
	public static void getDrivingLicenseRunnerDetails()
	{
		System.out.println("Person demographaicDetails : " + demoDetails);
		System.out.println("Person giveName : " + giveN);
		System.out.println("Person gender : " + gend);
		System.out.println("Person address : " + add);
		System.out.println("Person dob : " + dob);
		System.out.println("Person mobileNumber : " + mobileN);
		System.out.println("Person emailId : " + emailI);
		System.out.println("Person Aadhaar Number : " + addhaar);
	}


}