package day17.Pyramids;

public class PascalsTriangle {

	public static void main(String[] args) 
	{
		int no=6;
		int space=no;
		int number=1;
		for(int i=0;i<no;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			number=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number = number * (i-k)/(k+1);
			}
			space-=1;
			System.out.println();
		}

	}

}
