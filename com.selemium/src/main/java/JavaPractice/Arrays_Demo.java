package JavaPractice;

public class Arrays_Demo {
	
	public static void main(String[] args)
	{
		//Single Dimenstion Array
		
				int age[] = new int[5];
				
				age[0] = 10;
				age[1] = 20;
				age[2] = 30;
				age[3] = 40;
			
				for(int i:age)
				{
					System.out.println(i);
				}
			
			String name[] = new String[4];
			name[0] = "Santosh";
			name[1] = "Ankita";
			
			//or we can assign like below way to avoid limitation 
			
			//String newname[] = {"Santosh","Ankita", "Atharv"};
			//int num[] = {2,3,4,5,6,8,12};
			
			//Object obj[] = new Object[4];
			Object obj[] = {"Santosh", "A", 10, 23.5};
			for (Object obj1:obj)
			{
				System.out.println(obj1);
			}
			
			

			
	}

}
