class NewsPaperRunner{

	public static void main(String paper[]){


	NewsPaper ref =  new NewsPaper();
	 boolean value1=ref.createNewsPaper("Hindustan",29,"Hindi");
	 System.out.println(value1);
	 ref.displayInfo();

	 boolean value2=ref.createNewsPaper("PrajaVani",29,"Kannada");
	 System.out.println(value2);
	 ref.displayInfo();

	 boolean value3=ref.createNewsPaper("Times of India",29,"English");
	 System.out.println(value3);
	 ref.displayInfo();

	 boolean value4=ref.createNewsPaper("Kannada Prabha",29,"Kannada");
	 System.out.println(value4);
	 ref.displayInfo();

	 boolean value5=ref.createNewsPaper("VijayaVani", 28, "Kannada");
	 System.out.println(value5);
	 ref.displayInfo();

	 boolean value6=ref.createNewsPaper("Prajavani", 27, "Kannada");
	 System.out.println(value6);
	 ref.displayInfo();


	} 
}