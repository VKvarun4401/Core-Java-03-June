class Agarbathi
{
	String brandName;
	int noOfSticks;
	String fragnance;
	double price;
	
	public boolean pooja(String brandName, int noOfSticks, String fragnance, double price){
		
		boolean isWashCarCreated = false;
		if(brandName != null && noOfSticks > 0 && fragnance != null && price > 0.0 ){
			this.brandName = brandName;
			this.noOfSticks = noOfSticks;
			this.fragnance = fragnance;
			this.price = price;
			isWashCarCreated = true;
		}
		
		return isWashCarCreated;
		
	}
	
	public void displayAgarbathiInfo(){
		System.out.println("The agarbathi company name is " + this.brandName);
		System.out.println("The agarbathi noOfSticks are " + this.noOfSticks);
		System.out.println("The agarbathi fragnance is " + this.fragnance);
		System.out.println("The agarbathi price is " + this.price);

	}



}