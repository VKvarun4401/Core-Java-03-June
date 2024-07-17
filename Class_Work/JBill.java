class JBill
{
		static int billId = 4401;
		static String billIssueDate = "6/12/2024";
		static String billDueDate = "5/12/2024";
		static boolean isBillPaid = false;
		static boolean isLatestBill = true;
	
	public static void main(String bill[])
	{
		System.out.println("\n-------------------------------------------------------");
		System.out.println("The Jio Bill Id is : " + billId);
		System.out.println("The Jio Bill is Issued on : " + billIssueDate);
		System.out.println("The Jio Bill Due Date is : " + billDueDate);
		System.out.println("Is your Jio Bill Paid or Not : " + isBillPaid);
		System.out.println("Is this Jio Bill your Latest Bill : " + isLatestBill);
		System.out.println("-------------------------------------------------------");
	}

}