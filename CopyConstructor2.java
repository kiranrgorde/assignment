package Operation;

public class CopyConstructor2 {

	String name;
	int id;
	
	public CopyConstructor2(String n,int i)
	{
		name=n;
		id=i;
		
	}
	public CopyConstructor2(CopyConstructor2 s) {
		id=s.id;
		name=s.name;
		
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	public static void main(String[] args) {
		
		CopyConstructor2 s1=new CopyConstructor2("Piya",89);
		CopyConstructor2  s2=new CopyConstructor2(s1);
	
		
		s1.display();
		s2.display();
		
	}
	
}
