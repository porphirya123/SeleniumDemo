package Inheritance_Java;

class Vechile
{
	int wheels;
	String color;
	
	void features(int wheels, String color)
	{
		this.wheels = wheels;
		this.color = color;
		System.out.println("All vechiles have "+ this.wheels);
		System.out.println("-----------------------");
		System.out.println("My vechile color is "+this.color);
		System.out.println("-----------------------");
	}
	
}

class Skoda extends Vechile
{
	String Model;
	int nYear;
	
	void skodadetails(String Model, int nYear)
	{
		this.Model = Model;
		this.nYear = nYear;
		System.out.println("My skoda car Model is "+ this.Model);
		System.out.println("-----------------------");
		System.out.println("My skoda car Make Year is "+ this.nYear);
		System.out.println("-----------------------");
	;
	}
}





public class Demo1 {

	public static void main(String[] args) {
	
		Skoda obj = new Skoda();
		obj.features(4, "White");
		obj.skodadetails("Fabia", 2011);
	
	}

}
