package Operation;

public class ConstrustorOver {

	ConstrustorOver()
	{
		System.out.println("zero args constructor");
	}
	ConstrustorOver(int a)
	{
		System.out.println("one args constructor");
	}
	ConstrustorOver(int  a, int b)
	{
		System.out.println("tow args constructor");
	}
	
	public static void main(String[] args) {
		
		ConstrustorOver obj =new ConstrustorOver();
		ConstrustorOver obj2 =new ConstrustorOver(54);
		ConstrustorOver obj3= new ConstrustorOver(12, 20);
	}
	
}
