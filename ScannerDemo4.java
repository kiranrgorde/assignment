import java.util.*;

public class ScannerDemo4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("You have Entered Positive Number");
		}
		else if(n<0)
		{
			System.out.println("You have Entered Negative Number");
		}
		else if(n==0)
		{
			System.out.println("You have Entered Zero");
		}
		else 
		{
			System.out.println("You have Entered Wrong Input");
		}
	
	}
}