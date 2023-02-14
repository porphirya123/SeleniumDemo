package JavaPractice;

public class JavaRuff_3012 {
	
	public static void main(String[] args)
	{
		String name = "Santosh";
		String revName="";
		System.out.println(name.length());
		
		System.out.println(name);
		for(int i = name.length()-1;i>=0;i--)
		{
			revName = revName+name.charAt(i);
		}
		
		System.out.println("Reverse Name = "+revName);
	}
	

}
