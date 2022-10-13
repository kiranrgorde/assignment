package Operation;

public class ConstructDemo {
	
	String name;
	int id;
	
	public ConstructDemo(String n, int i)
	{
		name=n;
		id=i;
		
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
	}
	public static void main(String[] args) {
		
		ConstructDemo st1=new ConstructDemo("ravi",45);
		ConstructDemo st2=new ConstructDemo("kajol",55);
		
		st1.display();
		st2.display();
	}
	

}
