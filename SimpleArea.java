public class SimpleArea
{
	public static void main(String[] args)
	{
		int a=5;
		calculateArea(a);
	}
	public static void calculateArea(int a)
	{
		double Area= Math.sqrt(3)*a*a/4;
		System.out.println("The area is:"+Area);
	}
}