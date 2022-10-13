public class YearsDemo
{
	public static void main(String[] args)
	{
		int d=400;
		calDays(d);
	}
	public static void calDays(int d)
	{
		int years=d/365;
		int rem1=d%365;
		System.out.println("Years : "+years);
		int months=rem1/30;
		System.out.println("Months : "+months);
		int rem2=rem1%30;
		int weeks= rem2/7;
		System.out.println("Weeeks : "+weeks);
		int days= rem2%7;
		System.out.println("days : "+days);
		
	}
}