class DominosRunner
{

	public static void main(String zom[])
	{
		double foodName = Dominos.takeOrder("Blazing Onion & Paprika");
		double foodName1 = Dominos.takeOrder("Fiery Sausage & Paprika");
		double foodName2 = Dominos.takeOrder("Primavera Gourmet-Pizza");
		double foodName3 = Dominos.takeOrder("Smoked Chicken Gourmet-Pizza");
		double foodName4 = Dominos.takeOrder("Margherita");
		double foodName5 = Dominos.takeOrder("Farmhouse");
		System.out.println("Blazing Onion & Paprika Price is " + foodName);
		System.out.println("Fiery Sausage & Paprika Price is " + foodName1);
		System.out.println("Primavera Gourmet-Pizza Price is " + foodName2);
		System.out.println("Smoked Chicken Gourmet-Pizza Price is " + foodName3);
		System.out.println("Margherita Price is " + foodName4);
		System.out.println("Farmhouse Price is " + foodName4);
	
	}
}