class AtmMachine{
      
	  String branch;
	  String bankName;
	  String typeOfAtm;
	  double checkBalance;
	
	public AtmMachine(String branch, String bankName,	  String typeOfAtm,	  double checkBalance){
		this.branch=branch;
		this.bankName=bankName;
		this.typeOfAtm=typeOfAtm;
		this.checkBalance=checkBalance;
		
	}
	
	public void getDetails(){
		System.out.println("branch name is : " +branch);
		System.out.println("bankName is : " +bankName);
		System.out.println("typeOfAtm is : " +typeOfAtm);
		System.out.println("checkBalance is : " +checkBalance);
	}
}