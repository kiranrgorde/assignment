package Operation;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass3 obj= new MyClass3();
		int num1=10;
		int num2=20;
		int sum=obj.addition(num1, num2);
		System.out.println(sum);
		
	}
	public int addition(int num1, int num2)
	{
		int sum=num1+num2;
		return sum;
	}

}
