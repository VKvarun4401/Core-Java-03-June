class ChatShopRunner
{

	public static void main(String cha[])
	{
	
		boolean isAdded = ChatShop.addChatName("Pani Puri");
		System.out.println("is Chat Added : " + isAdded);
		//boolean isPriceAdded = ChatShop.addChatPrice(40.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		isAdded = ChatShop.addChatName("Sev Puri");
		System.out.println("is Chat Added : " + isAdded);
		//isPriceAdded = ChatShop.addChatPrice(80.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		
		isAdded = ChatShop.addChatName("Pav Bhaji");
		System.out.println("is Chat Added : " + isAdded);
		//isPriceAdded = ChatShop.addChatPrice(45.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		
		isAdded = ChatShop.addChatName("Patato Puri");
		System.out.println("is Chat Added : " + isAdded);
		//isPriceAdded = ChatShop.addChatPrice(50.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		
		isAdded = ChatShop.addChatName("Samosa Puri");
		System.out.println("is Chat Added : " + isAdded);
		//isPriceAdded = ChatShop.addChatPrice(60.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		isAdded = ChatShop.addChatName("Pani Puri");
		System.out.println("is Chat Added : " + isAdded);
		//isPriceAdded = ChatShop.addChatPrice(60.0);
		//System.out.println("is Chat Price Added : " + isPriceAdded);
		
		ChatShop.getChatName();
		
		
		boolean newChatNameUpdated = ChatShop.updateChatName("Patato Puri", "Kachori Puri");
		
		
		
		
	
		
		
		ChatShop.getChatName();
		//ChatShop.getChatPrice();
	
	}


}