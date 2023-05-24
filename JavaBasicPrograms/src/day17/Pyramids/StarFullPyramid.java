package day17.Pyramids;

public class StarFullPyramid {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)		//j=4 means 4 spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
			System.out.println("====================================================");
			for(int p=1;p<=4;p++)
			{
				for(int q=5;q>=p;q--)		//j=4 means 4 spaces
				{
					System.out.print(" ");
				}
				
				for(int r=1;r<=p;r++)
				{
					System.out.print("*");
				}
				for(int l=2;l<=p;l++)
				{
					System.out.print("*");
				}
				System.out.println();				
		}
	}

}
