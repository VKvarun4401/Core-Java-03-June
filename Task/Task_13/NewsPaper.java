class NewsPaper{
  String companyName;
  int id;
  int noOfPages;
  String language;
  double price;
  
  public NewsPaper(String companyName,  int id,  int noOfPages,  String language,  double price){
	  this.companyName=companyName;
	  this.id=id;
	  this.noOfPages=noOfPages;
	  this.language=language;
	  this.price=price;
  }
  
  public void getDetails(){
	  System.out.println("companyName is : " +companyName);
	  System.out.println("id is : " +id);
	  System.out.println("noOfPages is : " +noOfPages);
	  System.out.println("language is : " +language);
	  System.out.println("price is : " +price);
  }
}