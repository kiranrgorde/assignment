public class SalDemo
{
	public static void main(String[] args)
	{
		int BasicSal=30000;
		int hra=0;
		int da=0;
		
		if(BasicSal<=10000)
		{
			hra=20;
			da=80;
			
		}
		else if(BasicSal<=20000)
		{
			hra=25;
			da=90;
			
		}
		else if(BasicSal>20000)
		{
			hra=30;
			da=95;
		}
		double calhra=BasicSal*hra*1.0/100;
		double calda=BasicSal*da*1.0/100;
		double calBasicSal=BasicSal+calhra+calda;
		System.out.println(calBasicSal);
	}
}