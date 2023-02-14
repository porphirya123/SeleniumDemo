package JavaPractice.Interface;


interface A
{
	int aroi = 10;
	void display();
}


interface B
{
	int roi =20;
	void term();
}






public class InterfaceDemo1 implements A,B



{
	public void display()
	{
		System.out.println("Rate of Interest of SBI "+aroi);
	}

	public void term()
	{
		System.out.println("Rate of Interest of HDFC " +roi);
	}

	public static void main(String[] args) {
		A obj = new InterfaceDemo1();
		obj.display();
		
		B obj1 = new InterfaceDemo1();
		obj1.term();
		
		
	}

}
