package Operation;

public class MyClass2 {

	public static void main(String[] args) {
		
		MyClass2 obj=new MyClass2();
		int sum=obj.addition(); //return type without parameter 
		System.out.println(sum);
		

	}
	public int addition()
	{
		int num1=23;
		int num2=10;
		
		int sum=num1+num2;
		
		return sum;
	}

}
