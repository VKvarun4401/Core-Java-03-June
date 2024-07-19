class Shampoo
{

	String  brandName;
	String qty;
	String type;
	double price;
	String mgfDate;
	
	
	
	public boolean washCar(String brandName, String qty, String type, double price, String mgfDate){
		
		boolean isWashCarCreated = false;
		if(brandName != null && qty != null && type != null && price > 0.0 && mgfDate != null){
			this.brandName = brandName;
			this.qty = qty;
			this.type = type;
			this.price = price;
			this.mgfDate = mgfDate;
			isWashCarCreated = true;
		}
		
		return isWashCarCreated;
		
	}
	
	public void displayWashCar(){
		System.out.println("The shampoo brand name is " + this.brandName);
		System.out.println("The shampoo Quantity are " + this.qty);
		System.out.println("The shampoo type is " + this.type);
		System.out.println("The shampoo price is " + this.price);
		System.out.println("The shampoo mgfDate is " + this.mgfDate);
		
	}

}