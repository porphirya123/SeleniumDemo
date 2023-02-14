package OOPs_Concept;

public class Constructor_Overloading {
	
	String name;
	String city;
	int income;
	
	Constructor_Overloading()
	{
		System.out.println("No Parameter used");
		
	}
	
	Constructor_Overloading(String name)
	{
		this.name = name;
		System.out.println("Name - "+name);
		
	}
	
	Constructor_Overloading(String name, String city)
	{
		this.name = name;
		this.city = city;
		System.out.println("Name - "+name);
		System.out.println("City - "+city);
		
	}
	
	Constructor_Overloading(String name, String city, int income)
	{
		this.name = name;
		this.city = city;
		this.income = income;
		System.out.println("Name - "+name);
		System.out.println("City - "+city);
		System.out.println("Income - "+income);
		
	}
void display()
{
	System.out.println("Name - "+name);
	System.out.println("City - "+city);
	System.out.println("Income - "+income);
}

	public static void main(String[] args) {
		Constructor_Overloading obj = new Constructor_Overloading();
		System.out.println("---------------------");
		Constructor_Overloading obj1 = new Constructor_Overloading("Santosh");
		System.out.println("---------------------");
		Constructor_Overloading obj2 = new Constructor_Overloading("Atharv", "USA");
		System.out.println("---------------------");
		Constructor_Overloading obj3 = new Constructor_Overloading("Saanchi", "USA", 1000000);
		System.out.println("---------------------");
		
	}

}
