class Garden{
	String name;
	String place;
	int id ;
	
	public Garden(String name,	String place,	int id ){
		this.name=name;
		this.place=place;
		this.id=id;
		
	}
	public void getDetails(){
		System.out.println("name is : " +name);
		System.out.println("place name is : " +place);
		System.out.println("id is : " +id);
	}


}