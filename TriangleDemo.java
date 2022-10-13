public class TriangleDemo
{
	public static void main(String [] args)
	{
		int side1=20;
		int side2=20;
		int side3=40;
		myCode(side1,side2,side3);
	}
	public static void myCode(int side1,int side2, int side3)
	{
		if(side1==side2 && side2==side3 && side1==side3)
		{
			System.out.println("equilateral");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("isoscale");
			
		}
		else
		{
			System.out.println("scalene");
		}
	}
}