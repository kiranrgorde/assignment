import java.util.*;
public class ScannerDemo5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days which will be converted into years,months,weeks and days ");
		
		int days=sc.nextInt();
		
		int years=days/365;
		int rem1=days%365;
		int months=rem1/30;
		int rem2=rem1%30;
		int weeks=rem2/7;
		int day=rem2%7;
		
		System.out.println("Years : "+years);
		System.out.println("Months : "+months);
		System.out.println("Weeks : "+weeks);
		System.out.println("Days : "+day);
	}
}