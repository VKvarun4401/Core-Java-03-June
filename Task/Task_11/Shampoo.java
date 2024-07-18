class Shampoo
{

	String brandName;
	String qty;
	double price;
	String mgfDate;
	String expDate;
	
	
	public void washCar(){
		System.out.println("A non-static method belongs to an object of the class.!");
		System.out.println("non-static methods can accesss any static method and static variable also,\n without using the object of the class.!"); 
		
	}


}