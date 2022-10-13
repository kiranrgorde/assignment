import java.util.*;

public class ScannerDemo
{
	public static void main(String[] args)
	{
		mycode();
	}
	public static void mycode()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st num");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num");
		int num2=sc.nextInt();
		System.out.println("enter 1 for add 2 for sub 3 for mul 4 for division ");
		int operation=sc.nextInt();
		
		if(operation==1)
		{
		System.out.println("additon is "+(num1+num2));
		}
		else if(operation==2)
		{
		System.out.println("Subtraction is "+(num1-num2));
		}
		else if(operation==3)
		{
			System.out.println("Mul is "+(num1*num2));
		}
		else if(operation==4)
		{
			System.out.println("Div is "+(num1/num2));
			
		}
		else 
			System.out.println("wrong input!!");
	}
}