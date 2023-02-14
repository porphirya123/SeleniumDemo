package JavaPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ruff19122022 {

	public void reverseString() {

		String name = "Santosh";
		String reverse = "";

		for (int i = 0; i < name.length(); i++) {
			reverse = name.charAt(i) + reverse;
		}
		System.out.println(reverse);

	}
	
	public void revSen()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String sen = sc.nextLine();
		String[] newSen = sen.split(" ");
		List<String> texts = Arrays.asList(newSen);
		Collections.reverse(texts);
		for(String text:texts)
		{
			System.out.println(text+ " ");
		}
		
		
	}
	
	public void dateformat() 
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String date = "25-12-2022 12:12:33";
		try {
			System.out.println(df.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String revStCur(String name)
	{
		
		if(name==null || name.length()<=1)
		{
			return name;
		}
		return revStCur(name.substring(1)) + name.charAt(0);
				
	}
	

	public static void main(String[] args) {

		Ruff19122022 obj = new Ruff19122022();
		obj.reverseString();
		//obj.revSen();
		obj.dateformat();
		System.out.println(revStCur("Ankita"));

	}
}
