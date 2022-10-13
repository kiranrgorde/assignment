import java.util.*;

public class ScannerDemo3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Single Word you have to verify ");
		char w=sc.next().charAt(0);
		
		if(w>='A' && w<='Z')
		{
			System.out.println("Hey!!! You Have Entered Capital Word");
		}
		else if(w>='a' && w<='z')
		{
			System.out.println("Hey!! You Have Entered Small Word");
		}
		else if(w>='0' && w<='9')
		{
			System.out.println("Hey!! You Have Entered number");
		}
		else 
			System.out.println("Hey!! You Have Entered Special Symbol");
	}
}