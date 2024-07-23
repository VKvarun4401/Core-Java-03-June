class SunGlasses{
  
  String name;
  String type;
  double price;
  int id;
  
  public SunGlasses( int id,String name,  String type,  double price){
	  this.name=name;
	  this.type=type;
	  this.price=price;
	  this.id=id;
  }
  
  public void getDetails(){
	  System.out.println("name is : " +name);
	  System.out.println("type is : " +type);
	  System.out.println("prize is : " +price);
	  System.out.println("id is : " +id);
  }

}