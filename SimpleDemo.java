public class SimpleDemo
{
	public static void main(String[] args)
	{
		int r=5;
		calculateArea(r);
		
	}	
	public static void calculateArea(int r)
	{
		double pi=3.14;
		double area=pi*r*r;
		
		System.out.println("The area of circle is: "+ area);
	}
	
}