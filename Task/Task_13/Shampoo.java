class Shampoo{
	String brandName;
	int qty;
	String type;
	double prize;
	String mgfDate;
	String expDate;
	
	public Shampoo(String brandName,	int qty,	String type,	double prize,	String mgfDate,	String expDate){
		this.brandName=brandName;
		this.qty=qty;
		this.type=type;
		this.prize=prize;
		this.mgfDate=mgfDate;
		this.expDate=expDate;
		
		
	}
	
	public void getDetails(){
		System.out.println("brandName is : " +brandName);
	  System.out.println("qty is : " +qty);
	  System.out.println("type is : " +type);
	  System.out.println("prize is : " +prize);
	  System.out.println("mgfDate is : " +mgfDate);
	  System.out.println("expDate is : " +expDate);
	}

}