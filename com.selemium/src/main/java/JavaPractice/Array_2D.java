package JavaPractice;



public class Array_2D {
	
	

	public static void main(String[] args) {
	
		int num[][] = new int[2][3];
		
		num[0][0] = 5;
		num[0][1] = 25;
		num[0][2] = 35;
		
		num[1][0] = 35;
		num[1][1] = 45;
		num[1][2] = 65;
		
		// We can also assign like this to void limitation
		
		String names[][] = {{"Santosh", "Ankita"}, {"Doctor", "Nurse"}, {"Sita","Gita"}};
		
		for(String name[]:names)
		{
			for(String name2:name)
			{
				System.out.print(name2 + " ");
			}System.out.println();
		}
		
		
		/*
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(num[i][j] +" ");
			}System.out.println();
		}*/
		
		for(int i[]:num)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
		
	}

}
	