class Xworkz
{
	static String fName;
	static long cNumber;
	static long wNumber;
	static String emailId;
	static String eUSN;
	public static boolean createXworkz(String fullName, long contactNumber, long whatsAppNumber, String email, String enterUSN){
		boolean isXworlzCreated = false;
		boolean isFullName = false;
		boolean isContactNumber = false;
		boolean isWhatsAppNumber = false;
		boolean isEmailId = false;
		boolean isEnterUSN = false;
		System.out.println("Xworkz Account Creation Process Is Started..");
		
		
		if(fullName != null){
			fName = fullName;
			isFullName = true;
			isXworlzCreated = true;
			System.out.println("Full Name Is Successfull.");
		}else{
			System.out.println("Please Enter Valid User Name.");
			return isFullName;
		}
		
		if(contactNumber > 0){
			cNumber = contactNumber;
			isContactNumber = true;
			isXworlzCreated = true;
			System.out.println("Contact Number Is Successfull.");
		}else{
			System.out.println("Please Enter Valid Contact Number.");
			return isContactNumber;
		}
		
		if(whatsAppNumber > 0){
			wNumber = whatsAppNumber;
			isWhatsAppNumber = true;
			isXworlzCreated = true;
			System.out.println("WhatsApp Number Is Successfull.");
		}else{
			System.out.println("Please Enter Valid whatsApp Number.");
			return isWhatsAppNumber;
		}
		
		if(email != null){
			emailId = email;
			isEmailId = true;
			isXworlzCreated = true;
			System.out.println("Email Id Is Successfull.");
		}else{
			System.out.println("Please Enter Valid Email Id.");
			return isEmailId;
		}
		
		if(enterUSN != null){
			eUSN = enterUSN;
			isEnterUSN = true;
			isXworlzCreated = true;
			System.out.println("Enter USN Is Successfull.");
		}else{
			System.out.println("Please Enter Valid USN.");
			return isEnterUSN;
		}
		
		System.out.println("Xworkz Account Creation Process Is Started..");
		return isXworlzCreated;
	}
	
	public static void getXworkzDetails()
	{
		
		System.out.println("Full Name : " + fName);
		System.out.println("Contact Number : " + cNumber);
		System.out.println("WhatsApp Number : " + wNumber);
		System.out.println("Email Id : " + emailId);
		System.out.println("Enter USN : " + eUSN);
		return;
	}

}