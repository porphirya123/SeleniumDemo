package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ruffwork13122022 {

	public void reverseText() {
		String text = "Java is a programming language";

		String[] text1 = text.split(" ");
		List<String> newtext = Arrays.asList(text1);
		Collections.reverse(newtext);

		for (String rtext : newtext) {
			System.out.print(rtext + " ");
		}
	}

	
	
	public void swapNum()
	{
		int num1 = 10;
		int num2 = 20;
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
	public void reverseLetter()
	{
		String name = "Santosh";
		String rev = "";
		
		for(int i = 0;i<name.length();i++)
		{
			rev = name.charAt(i)+rev;
			
		}
		System.out.println();
		System.out.println(rev);
	}
	
	
	public void Division()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if(num%2==0 && num%3==0 && num%5==0)
		{
			System.out.println("This number is divisible by 2,3 and 5 "+num);
		}
		else
		{
			System.out.println("This number is NOT divisible by 2,3 and 5 "+num);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		Ruffwork13122022 obj = new Ruffwork13122022();
		obj.reverseText();
		obj.reverseLetter();
		//obj.Division();
		obj.swapNum();

	}

}
