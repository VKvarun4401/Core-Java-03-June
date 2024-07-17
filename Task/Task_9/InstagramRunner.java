class InstagramRunner
{
	public static void main(String ins[])
	{
		boolean isInstagramValidation = Instagram.createInstagramAccount("vkvarun@gmail.com",8987440194L,"Mehta","vk","vasu123");
		if(isInstagramValidation == true){
			Instagram.getInstagramDetails();
		}else{
			System.out.println("Please Provide Your Correct Information..");
		}
	}


}