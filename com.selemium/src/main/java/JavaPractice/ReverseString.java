package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {
		
	String name = "Santosh";
	String rev = "";
	System.out.print("Hello ");
		
		for(int i=0; i<name.length(); i++)
		{
			
			rev = name.charAt(i)+rev;
			
		}
		System.out.print("Reverse Name is = "+rev);
	}

}
