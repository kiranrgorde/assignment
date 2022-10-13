public class RateofIntrest
{
	public static void main(String[] args)
	{
		int p = 1000;
		double r=0.5;
		int n=12;
		int t=5;
		mycode(p,r,n,t);
		
	}
	public static void mycode(int p,double r,int n,int t)
	//A=p(1+r/n)n*t)
	{
		double spart=(1+r/n);
		int tpart=n*t;
		double A=p*Math.pow(spart,tpart);
		System.out.println(A);
	}
}