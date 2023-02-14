package JavaPractice;

public class JavaPract_DEMO1101 {
	
	static void stringMethod()
	{
		String name = "Santosh";
		String rev = "";
		for(int i=0;i<name.length();i++)
		{
			
			rev = name.charAt(i) + rev;
			
			
			
		}
		System.out.println(rev);
	}
	
	

	public static void main(String[] args) {
		stringMethod();

	}

}
