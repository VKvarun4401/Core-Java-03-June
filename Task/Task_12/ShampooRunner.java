class ShampooRunner
{

	public static void main(String shampoo[]){
		System.out.println("-------------------------------------------------------------------");
		Shampoo sha = new Shampoo();
		sha.washCar("Dove Nutritive Solutions Intense Repair", "1LTR", "Intense Repair", 579.00, "7/19/2024");
		sha.displayWashCar();
		System.out.println("-------------------------------------------------------------------");
		
		
		Shampoo sha1 = new Shampoo();
		sha1.washCar("TRESemme Keratin Smooth", "190ML", "Shiney Hair Shampoo", 569.00, "7/20/2024");
		sha1.displayWashCar();
		System.out.println("-------------------------------------------------------------------");
		
		Shampoo sha2 = new Shampoo();
		sha2.washCar("Herbal Essences Bio", "400ML", "Oil of Morocco", 395.00, "7/21/2024");
		sha2.displayWashCar();
		System.out.println("-------------------------------------------------------------------");
		
		Shampoo sha3 = new Shampoo();
		sha3.washCar("Dabur Vatika", "640ML", "Helath Shampoo", 219.00, "7/22/2024");
		sha3.displayWashCar();
		System.out.println("-------------------------------------------------------------------");
		
		Shampoo sha4 = new Shampoo();
		sha4.washCar("Himalaya Gentle Daily Care", "700Ml", "Protein Shampoo", 414.00, "7/23/2024");
		sha4.displayWashCar();
		
	}


}