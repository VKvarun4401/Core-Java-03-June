class XworkzRunner
{
	
	public static void main(String xwo[])
	{
		boolean isXworkzValidation = Xworkz.createXworkz("Varun Kumar",7361074372L,7361074372L,"vkvarun@gmail.com","1NT22MC114");
		if(isXworkzValidation == true){
			Xworkz.getXworkzDetails();
		}else{
			System.out.println("Please Provide Correct Information.");
			
		}
		
	}
	
}
