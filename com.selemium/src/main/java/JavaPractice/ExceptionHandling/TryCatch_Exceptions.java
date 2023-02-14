package JavaPractice.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Exception is kind on an unexpected event which can break your code and stop your rest of program execution 
// We have different type of execution that we can use to handle it like ArithmeticException, InputMismatchException etc.
// Exception e will capture almost every type of exception
// finally is block will execute in every situation




public class TryCatch_Exceptions {

	
	
	public static void main(String[] args)throws IOException
	{
		try
		
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd Number for division = ");
		int num2 = sc.nextInt();
		
		int div = num1/num2;
		System.out.println("Division Result = "+div);
		} 
		catch(ArithmeticException e)
		{
			System.out.println("You can't divide a number by ZERO");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You can't divide a number by String");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("YoO");
		}
	}
	
	
	
}
