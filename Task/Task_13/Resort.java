class Resort{
	String areaInSqrt;
	String propertyName;
	String ownerName;
	int noOfRooms;
	int id;
	
	public Resort(String areaInSqrt,	String propertyName,	String ownerName,	int noOfRooms,	int id){
		this.areaInSqrt=areaInSqrt;
		this.propertyName=propertyName;
		this.ownerName=ownerName;
		this.noOfRooms=noOfRooms;
		this.id=id;
		
	}
	
	public void getDetails(){
		System.out.println("areaInSqrt is : " +areaInSqrt);
	  System.out.println("propertyName is : " +propertyName);
	  System.out.println("ownerName is : " +ownerName);
	  System.out.println("noOfRooms is : " +noOfRooms);
	  System.out.println("id is : " +id);
	}


}