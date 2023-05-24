package day17.Pyramids;

public class NumbersFullPyramid {

	public static void main(String[] args) 
	{
		int i,j,spaces=8;
		for(i=1;i<=5;i++)
		{
			for(j=0;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			int k=i;
			for(j=0;j<i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			k-=2;
			for(j=0;j<i-1;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			
			System.out.println();
			spaces-=2;
			
		}

	}

}
