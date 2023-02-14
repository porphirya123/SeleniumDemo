package JavaPractice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st Number ");
	int num1 = sc.nextInt();
	System.out.println("Enter the 2nd Number ");
	int num2 = sc.nextInt();
	
	System.out.println("Before swap Your 1st and 2nd Numbers are = "+num1 +" & "+num2);
	
	num1 = num1+num2;
	num2 = num1-num2;
	num1 = num1-num2;
	
	System.out.println("After swap Your 1st and 2nd Numbers are = "+num1 +" & "+num2);
		
	}

}
