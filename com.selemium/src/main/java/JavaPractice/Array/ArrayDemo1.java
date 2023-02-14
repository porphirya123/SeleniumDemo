package JavaPractice.Array;

public class ArrayDemo1 {
	public void singleArray()
	{
	int age[] = new int[3];
	age[0] = 10;
	age[1] = 14;
	age[2] = 40;
	
	System.out.println(age[0]);
	for(int newage:age)
	{
		System.out.println(newage);
	}
	
	}
	
	public void twoDArray()
	{
		int age[][] = new int[2][3];
		age[0][0]= 4;
		age[0][1]= 5;
		age[0][2]= 42;
		age[1][0]= 32;
		age[1][1]= 43;
		age[1][2]= 63;
		System.out.println(age[1][2]);
		for(int i=0;i<2;i++)
		{
			for(int j=0;i<3;j++)
			{
				System.out.println(age[i][j]);
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		
		ArrayDemo1 ar = new ArrayDemo1();
		ar.singleArray();
		ar.twoDArray();
	}

}

