public class SmallDemo
{
	public static void main(String[] args)
	{
		int a=50;
		int b=46;
		int c=56;
		myCode(a,b,c);
	}
	public static void myCode(int a , int b , int c)
	{
		if((a<b)&&(a<c))
		{
			System.out.println(a +" smaller than " + b + " "+c);
		}
		else if((b<a)&&(b<c))
		{
			System.out.println(b + " smaller than "+ a+ " "+c);
			
		}
		else
		{
			System.out.println(c +"smaller than "+ a + " "+ b);
		}
	}
}