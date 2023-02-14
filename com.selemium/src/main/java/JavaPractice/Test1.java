package JavaPractice;

import java.util.Scanner;

public class Test1 {
	
	public void revText(String name)
	{
		for(int i=name.length()-1;i>=0;i--)
		{
			
			System.out.println(name.charAt(i));
		}
	}
	

public void swapNum(int num1, int num2)
{
	System.out.println("Before Swaping Value of Num1 = "+num1);
	System.out.println("Before Swaping Value of Num1 = "+num2);
	num2=num1+num2;
	num1 = num2-num1;
	num2 = num2-num1;
	
	System.out.println("Before Swaping Value of Num1 = "+num1);
	System.out.println("Before Swaping Value of Num1 = "+num2);
}

	public void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		obj.oddEven(23);
		
		obj.swapNum(20, 43);
		obj.revText("Sunita");
		
		
	}
}
