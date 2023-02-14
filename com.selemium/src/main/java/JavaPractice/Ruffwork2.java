package JavaPractice;

import java.util.Scanner;

public class Ruffwork2 {
	
	public void reversetext()
	{
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your desired text ");
		String name = sc.nextLine();
		
		for(int i = 0; i<name.length();i++)
		{
			reverse = name.charAt(i)+reverse;
			
		}
		System.out.println("Reverse text is "+reverse);
				
			
		}
	
	public void checkdivision()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You desired number ");
		int num = sc.nextInt();
		if (num%2==0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}
	

	public static void main(String[] args) {
		
		Ruffwork2 obj = new Ruffwork2();
		obj.checkdivision();
		obj.reversetext();
	
	}
		
	

}
