public class R
{


	private static void mynum(int n)
	{
		if(n==0)
			return;
		
		System.out.println(n*n);
		mynum(n-1);
	
	}
	public static void main(String[] args)
	{
		int n=5;
		
		mynum(n);
		
	}
}