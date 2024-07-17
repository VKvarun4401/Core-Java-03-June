class LoanApplicationRunner
{

	public static void main(String loa[])
	{
		boolean isLoanApplicationValidation = LoanApplication.createLoanApplication(58796453214L, "Union Bank", 95, 8.25, null);
		if(isLoanApplicationValidation == true){
			
			LoanApplication.getLoanApplicationDetails();
		}else{
			System.out.println("Please Enter a Valid Information.");
		}
	}


}