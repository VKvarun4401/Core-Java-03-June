class Battery{
  int id;
  String name;
  String weight;
  
 public Battery(int id,  String name,  String weight){
	 this.id=id;
	 this.name=name;
	 this.weight=weight;
 }
 
 public void getDetails(){
	 System.out.println("id is : " +id);
	 System.out.println("name is : " +name);
	 System.out.println("weight is : " +weight);
 }
}