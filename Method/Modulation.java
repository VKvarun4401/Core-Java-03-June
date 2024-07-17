class Modulation
{
	public static void main(String mod[])
	{
		mod(56, 32);
		mod(100, 65);
		mod(50, 3);
		mod(78, 63);
	}
	public static void mod(int num1, int num2)
	{
		System.out.println(num1 % num2);
	}
}