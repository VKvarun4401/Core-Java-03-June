class LoanApplication
{
	static long bAccountNumber;
	static String bName;
	static int cScore;
	static double rOfInterest;
	static String lType;
	public static boolean createLoanApplication(long bankAccountNumber, String bankName, int creditScore, double rateOfInterest, String loanType)
	{
		System.out.println("Loan Application Process is started...");
		boolean isLoanApplicationProcessCreated = false;
		boolean isBAccountNumber = false;
		boolean isBName = false;
		boolean isCScore = false;
		boolean isROfInterest = false;
		boolean isLType = false;
		
		
		if(bankAccountNumber > 0){
			bAccountNumber = bankAccountNumber;
			isBAccountNumber = true;
			isLoanApplicationProcessCreated = true;
			System.out.println("Bank Account Number Validation Is Successfull.");
			
			
		}else{
			System.out.println("Please Enter Valid Bank Account Number.");
			return isBAccountNumber;
			
		}
		
		if(bankName != null){
			bName = bankName;
			isBName = true;
			isLoanApplicationProcessCreated = true;
			System.out.println("Bank Name Validation Is Successfull.");
			
		}else{
			System.out.println("Please Enter Valid Bank Name.");
			return isBName;
		}
		
		if(creditScore > 0){
			cScore = creditScore;
			isCScore = true;
			isLoanApplicationProcessCreated = true;
			System.out.println("Bank Credit Score Validation Is Successfull.");
			
		}else{
			System.out.println("Please Enter Correct Credit Score.");
			return isCScore;
		}
		
		if(rateOfInterest > 0.0){
			rOfInterest = rateOfInterest;
			isROfInterest = true;
			isLoanApplicationProcessCreated = true;
			System.out.println("Bank Loan Rate Of Interest Validation Is Successfull.");
			
		}else{
			System.out.println("Please Enter Correct Rate Of Interest.");
			return isROfInterest;
		}
		
		if(loanType != null){
			lType = loanType;
			isLType = true;
			isLoanApplicationProcessCreated = true;
			System.out.println("Bank Loan Type Validation Is Successfull.");
			
		}else{
			System.out.println("Please Enter Valid Loan Type.");
			return isLType;
		}
		

		System.out.println("Loan Application Process is started...");
		return isLoanApplicationProcessCreated;
	}
	
	public static void getLoanApplicationDetails(){
		System.out.println("Bank Account Number : " + bAccountNumber);
		System.out.println("Bank Name : " + bName);
		System.out.println("Bank Credit Score : " + cScore);
		System.out.println("Bank Loan Rate Interest : " + rOfInterest);
		System.out.println("Bank Loan Type : " + lType);
	}

}