package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ruff2312 {

	public String reverseName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		String rev = "";

		for (int i = 0; i < name.length(); i++) {
			rev = name.charAt(i) + rev;

		}
		return rev;
	}

	public void reverseSen() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentence: ");
		String sen = sc.nextLine();
		String[] text = sen.split(" ");
		List<String> ntext = Arrays.asList(text);
		Collections.reverse(ntext);
		for(String rtext:ntext)
		{
			System.out.print(rtext+" ");
		}

		
	}
	
	
	
	
	
	public static void main(String[] args) {

		Ruff2312 obj = new Ruff2312();
		//System.out.println(obj.reverseName());
		obj.reverseSen();

	}
}