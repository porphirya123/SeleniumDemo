package JavaPractice;

public class StringPractice_1201 {
	
	
	
	
	
	

	public static void main(String[] args) {
		
		String name = "Santosh";
		int age = 40;
		char charat = name.charAt(3);
		
		System.out.println(charat);
		System.out.println(name.compareTo("Ankita"));
		
		if(name.equalsIgnoreCase("dsfds"))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
	}

}
