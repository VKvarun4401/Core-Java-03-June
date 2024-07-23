class AmusementPark{
	String name;
	String place;
	int id ;
	int noOfGames;
	
	public AmusementPark(String name,	String place,	int id,	int noOfGames){
		this.name=name;
		this.place=place;
		this.id=id;
		this.noOfGames=noOfGames;
	}
	
	/*public void play(){
	System.out.println("AmusementPark is the best palce to get children in the weekend");
	}*/
	
	public void getDetails(){
		System.out.println("the name is : " +name);
		System.out.println("the place is : "+place);
		System.out.println("the id is : "+id);
		System.out.println("the no of games is : " +noOfGames);
	}



}