package JavaPractice;


interface TestInterface
{
	int age = 40;
	void display();
}


public class Interface_Demo implements TestInterface
{
	public void display()
	{
		System.out.println("Age = "+age);
	}
	public static void main(String[] args) {
	
		TestInterface obj = new Interface_Demo();
		obj.display();
				
	
	}

}
