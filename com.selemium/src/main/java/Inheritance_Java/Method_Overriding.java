package Inheritance_Java;

class Tubelight
{
	 int inputPower()
	{	
		 System.out.print("TubeLight generally consumes watts ");
		return 10;
	}
}

class TV
{
	int inputPower()
	{
		System.out.println("TV generally consumes watts ");
	return 20;
	}
}

class Heater extends TV
{
	int inputPower()
	{
	System.out.println("Heater generally consumes watts ");
	return 1500;
	}
}


public class Method_Overriding {
	
	
	

	public static void main(String[] args) {
	Tubelight tubeobj = new Tubelight();
	System.out.print(tubeobj.inputPower());
	TV tvobj = new TV();
	tvobj.inputPower();
	System.out.print(tvobj.inputPower());
	
	}

}
