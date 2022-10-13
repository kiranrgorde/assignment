package Operation;

public class MyClass {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		
		obj.additon();
		obj.mult();
		obj.subtraction();
		
	}
	public void additon() 
	{
		int num1=23;
		int num2=10; 
		int add= num1+num2;
		
		System.out.println(add);
	}
	public void subtraction()
	{
		int num3=10;
		int num4=11;
		int sub=num3-num4;
		
		System.out.println(sub);
	}
	public void mult() 
	{
		int num5=6;
		int num6=8;
		int mul=num5*num6;
		
		System.out.println(mul);
	}

}
