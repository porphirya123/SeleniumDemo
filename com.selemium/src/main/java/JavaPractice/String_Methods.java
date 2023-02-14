package JavaPractice;

public class String_Methods {

	public static void main(String[] args) {
		
	String name = "Santosh";
	String sen = "I love Java but Python is my favourite one";
	String sen1 = sen.concat(" but Java is also fun");
	char sen2 = sen1.charAt(5);
	
	System.out.println(name.length());
	System.out.println(sen.length());
	System.out.println(sen1);
	System.out.println(name.equals("Santosh"));
	System.out.println(sen2);
	System.out.println(sen.indexOf("is"));
	System.out.println(name.substring(0,3)); // you have provide the range which you want the substring
	System.out.println(name.substring(4,6));
	System.out.println(name.replace("San", "Mon"));
	System.out.println(sen.split(name));
	
		
		
	}

}
