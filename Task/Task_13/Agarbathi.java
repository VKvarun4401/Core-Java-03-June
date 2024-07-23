class Agarbathi{
   String brandName;
   int id;
   int noOfSticks;
   String fragrance;
   double price;
   
   public Agarbathi(String brandName,   int id,   int noOfSticks,   String fragrance,   double price){
	   this.brandName = brandName;
	   this.id= id;
	   this.noOfSticks = noOfSticks;
	   this.fragrance = fragrance;
	   this.price = price;
	   
   }
   
   //public void pooja(){
     //System.out.println("To Pray");
   
   public void getDetails(){
	   System.out.println("the brand name is : " +brandName);
	   System.out.println("the id is : " +id);
	   System.out.println("the no of sticks is : " +noOfSticks);
	   System.out.println("the fragrance is : " +fragrance);
	   System.out.println("the price is : " +price);
   }
}