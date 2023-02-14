package OOPs_Concept;

public class Method_Overloading {
	
	void display()
	{
		System.out.println("This method doesn't use any parameter");
	}
	
	void display(int a)
	{
		
		System.out.println("This method take 1 Integer Parameter - "+a);
	}
	
	void display(String name, int rollno)
	{
		
		System.out.println("This method takes 1 String and 1 Integer Parameter - " +name+" " + rollno);
	}

	public static void main(String[] args)
	{
		Method_Overloading obj = new Method_Overloading();
		obj.display();
		System.out.println("---------------------");
		obj.display(10);
		System.out.println("---------------------");
		obj.display("Santosh", 20);
		System.out.println("---------------------");
	}
}

