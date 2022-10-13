package Operation;

public class MethodOverload {

		void add()
		{
			System.out.println(10+20);
		}
		void add(int num1)
		{
			System.out.println(10+num1);
		}
		void add(int num1, int num2)
		{
			System.out.println(num1+num2);
		}
		
		public static void main(String[] args) {
			MethodOverload obj=new MethodOverload();
			obj.add();
			obj.add(12);
			obj.add(13, 35);
		}
		
	}


