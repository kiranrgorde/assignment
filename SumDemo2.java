public class SumDemo2
{
	public static void main(String [] args)
	{
		int num=1234;
		int sum=0;
		
		do{
			sum = sum + num %10;
			num = num /10;
		}
		while(num >0);
		System.out.println("The Sum of digits is: "+sum);
	}
}