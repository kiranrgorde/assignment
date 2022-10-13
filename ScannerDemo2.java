import java.util.*;

public class ScannerDemo2
{
	public static void main(String[] args)
	{
		mycode();
	}
	public static void mycode()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Cost price");
		int cp=sc.nextInt();
		System.out.println("Enter Your Selling Price");
		int sp=sc.nextInt();
	
		if(sp>cp)
		{
			System.out.println("Hoila!! You are in Profit of " +(sp-cp)+" Rupees");
		}
		else if(sp<cp)
		{
			System.out.println("Opps You are In Loss of "+(cp-sp)+" Rupees");
		}
	}
}