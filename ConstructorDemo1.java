package Operation;

public class ConstructorDemo1 {
	
	String name;
	int id;
	float salray;
	
	public ConstructorDemo1(String n,int id)
	{
		name=n;
		this.id=id;
		
		
	}
	void display()
	{
		System.out.println("name :"+name);
		System.out.println("id: "+id);
		
	}
	public static void main(String[] args) {
		ConstructorDemo1 s1=new ConstructorDemo1("abc",88);
		s1.display();
	}

}
