class AgarbathiRunner{
	
	public static void main(String agarbathi[]){
		
		Agarbathi ref = new Agarbathi();
		ref.pooja("Cycle", 50, "Sandalwood", 10.00);
		ref.displayAgarbathiInfo();
		System.out.println("----------------------------------------");
		
		
		Agarbathi aga1 = new Agarbathi();
		aga1.pooja("Mangaldeep", 40, "Rose", 12.00);
		aga1.displayAgarbathiInfo();
		System.out.println("----------------------------------------");
		
		
		Agarbathi aga2 = new Agarbathi();
		aga2.pooja("Zed Black", 60, "Lavender", 15.00);
		aga2.displayAgarbathiInfo();
		System.out.println("----------------------------------------");
		
		
		Agarbathi aga3 = new Agarbathi();
		aga3.pooja("Satya Sai Baba", 55, "Nag Champa", 11.50);
		aga3.displayAgarbathiInfo();
		System.out.println("----------------------------------------");
		
		
		Agarbathi aga4 = new Agarbathi();
		aga4.pooja("Tulasi", 45, "Jasmine", 14.75);
		aga4.displayAgarbathiInfo();
		System.out.println("----------------------------------------");
		
	}


}