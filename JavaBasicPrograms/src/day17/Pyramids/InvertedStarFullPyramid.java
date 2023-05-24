package day17.Pyramids;

public class InvertedStarFullPyramid 
{

public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=i;j++)//spaces
			{
				System.out.print(" ");
			}
			/*for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}*/
			for(int k=9;k>(i*2);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
