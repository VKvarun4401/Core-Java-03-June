class BillRunner
{

	public static void main(String bill[])
	{
		Bill ref = new Bill();
		ref.billId = 101;
		ref.billIssuedDate = "7/18/2024";
		ref.billExpiryDate = "7/15/2024";
		ref.isBillPaid = "Yes";
		ref.latestBill = "7/01/2024";
		System.out.println("Bill Id Is : " + ref.billId);
		System.out.println("Bill billIssuedDate Is : " + ref.billIssuedDate);
		System.out.println("Bill billExpiryDate Is : " + ref.billExpiryDate);
		System.out.println("Bill isBillPaid Is : " + ref.isBillPaid);
		System.out.println("Bill latestBill Is : " + ref.latestBill);
		
		System.out.println("-------------------------------------------------");
		
		
		Bill ref1 = new Bill();
		ref1.billId = 102;
		ref1.billIssuedDate = "6/01/2024";
		ref1.billExpiryDate = "7/15/2024";
		ref1.isBillPaid = "Yes";
		ref1.latestBill = "7/01/2024";
		System.out.println("Bill Id Is : " + ref1.billId);
		System.out.println("Bill billIssuedDate Is : " + ref1.billIssuedDate);
		System.out.println("Bill billExpiryDate Is : " + ref1.billExpiryDate);
		System.out.println("Bill isBillPaid Is : " + ref1.isBillPaid);
		System.out.println("Bill latestBill Is : " + ref1.latestBill);
		
		
	
	}

}