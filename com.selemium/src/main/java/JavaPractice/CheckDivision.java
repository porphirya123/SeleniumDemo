package JavaPractice;

import java.util.Scanner;

public class CheckDivision {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter desire no ");
	int num = sc.nextInt();
	
	if (num%2==0)
	{
		System.out.println("Number is divisionable by 2");
	}
	
	else
	{
		System.out.println("Not Divisible by 2");
	}
		
	}

}
