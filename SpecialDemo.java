public class SpecialDemo
{
	public static void main(String [] args)
	{
		char ch='4';
		myCode(ch);
	}
	public static void myCode(char ch)
	{
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Uppercase!!");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase!!");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("number!!");
		}
		else
		{
			System.out.println("Special character");
		}
	}
}