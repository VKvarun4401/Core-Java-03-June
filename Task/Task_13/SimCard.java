class SimCard{
	String name;
	String plan;
	int id ;
	
	public SimCard(String name,	String plan,	int id ){
		this.name=name;
		this.plan=plan;
		this.id=id;
	}
	
	public void getDetails(){
		System.out.println("name is : " +name);
	  System.out.println("plan is : " +plan);
	  System.out.println("id is : " +id);
	}
}