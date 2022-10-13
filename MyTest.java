package Operation;

public class MyTest extends A{
int a=43;
	MyTest()
	{
	
		System.out.println("calling from mytest");
	}
	MyTest(int a)
	{
		this();
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		MyTest obj=new MyTest(12);
	}
	
}
