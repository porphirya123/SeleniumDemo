package OOPs_Concept;

public class ClassObject_Demo1 {
	
	String studentName;
	String address;
	String stream;
	int marks;
	
	void display()
	{
		System.out.println(studentName);
		System.out.println(address);
		System.out.println(stream);
		System.out.println(marks);
		
	}
	
	ClassObject_Demo1(String name, String add, String st, int percen)
	{
		studentName = name;
		address = add;
		stream = st;
		marks = percen;
	}
	
	public static void main(String args[])
	{
		
		ClassObject_Demo1 obj = new ClassObject_Demo1("Santosh", "Noida", "Math", 67);
		
		obj.display();
	}
	
	

	
	
	

}
