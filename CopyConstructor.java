package Operation;

public class CopyConstructor {

	String name;
	int id;
	
	public CopyConstructor(String n,int i)
	{
		name=n;
		id=i;
		
	}
	public CopyConstructor() {
		
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	public static void main(String[] args) {
		
		CopyConstructor s1=new CopyConstructor("Piya",89);
		CopyConstructor s2=new CopyConstructor();
		
		s2.id=s1.id;
		s2.name=s1.name;
		
		s1.display();
		s2.display();
		
	}
	
}
