class BankAccountDetails
{

	int id;
	String accountHolderName;
	String bankName;
	String ifscCode;
	
	public BankAccountDetails(int id, String accountHolderName, String bankName, String ifscCode){
	
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		
	}
	
	public void bankAccountDeatils(){
		
		System.out.println("Account Id : " + this.id);
		System.out.println("Account holder name : " + this.accountHolderName);
		System.out.println("Bank account name is : " + this.bankName);
		System.out.println("IFSC code is : " + this.ifscCode);
		
	}
	


}