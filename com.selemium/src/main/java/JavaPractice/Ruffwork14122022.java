package JavaPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Ruffwork14122022 {
	
	String name = "Santosh";
	
	public static void revereSentence()
	{
	
	String text = "I like Java";
	String[] text1 = text.split(" ");
	
	List<String> newtexts = Arrays.asList(text1);
	Collections.reverse(newtexts);
	
	for(String newtext: newtexts)
	{
		System.out.print(newtext + " ");
	}
	
	}
	
	public static void reversetext()
	{
		String name = "Ankita";
		String rev = "";
		
		for(int i=0;i<name.length();i++)
		{
			rev = name.charAt(i)+rev;
			
		}
		System.out.println();
		System.out.println(rev);
	}
	
	public static void convertDate()
	{
		SimpleDateFormat newdate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String date = "14-12-2022 10:22:23";
		try {
			System.out.print(newdate.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String reverseRecursive(String name)
	{
		
		if(name==null || name.length()<=1)
		{
			return name;
		}
		return reverseRecursive(name.substring(1))+name.charAt(0);
	}
	

	public static void main(String[] args) {
		
		
		
		revereSentence();
		
		reversetext();
		convertDate();
		System.out.println(reverseRecursive("Santosh"));
		
	}
 
}
