package JavaPractice;

import java.util.Scanner;

public class WhileLoop_Demo {

	public static void GussstheNumber() {

		int num;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			num = sc.nextInt();

			if (num == 10) {
				System.out.println("You got it");
				break;
			} else {
				System.out.println("Keep Trying");
				continue;

			}

		} while (num != 10);
	}

	
	public static void printtillTen()
	{
		int num=1;
		while(num!=11)
		{
			System.out.println(num);
			num++;
			continue;
		}
	}
	
	
	public static void dowhile()
	{
		int num=1;
		do
		{
			System.out.println(num);
			num++;
		}
		while(num<=10);
	}
	public static void main(String[] args) 
	{
		
		//GussstheNumber();
		
		//printtillTen();
		dowhile();
	}

}
