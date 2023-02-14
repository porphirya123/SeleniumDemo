package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {
	
	public static void main(String[] args)
	{
		String text = "It is a beautiful Day";
		
		String[] words = text.split(" ");
		List<String> newwords = Arrays.asList(words);
		Collections.reverse(newwords);
		
		for(String newword:newwords)
		{
			System.out.print(newword + " ");
		}
		
		
		
		
		
		
		
	}

}	
