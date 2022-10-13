package Operation;

public class MyMethodClass {

	public static void main(String[] args)
	{
		//no return type with parameter
		
		MyMethodClass obj= new MyMethodClass();
		int num1=10;
		int num2=20; 
		
		obj.addition(num1, num2);
		obj.subtraction(num1, num2);

	}
	public void addition(int num1, int num2)
	{
		double add=num1+num2;
		System.out.println(add);
	}
	public void subtraction(int num1, int num2)
	{
		int sub=num1-num2;
		System.out.println(sub);
	}

}
