package day11.nestedforloop;

public class NestedFor {

	public static void main(String[] args) 
	{
		/*for(int i=0; i<3;i++)
		{
			System.out.println("************ hello i "+i);
		}
		*/
		for(int i=0;i<3;++i)
		{
			System.out.println("Hello i : "+i);
			for(int j=0;j<2;j++)
			{
				System.out.println("\t hi j : "+j);
			}
		}
		System.out.println("**************************");
		
		
		/*for(int i=0;i<3;i++)
			System.out.println("Hello i : "+i);
			for(int j=0;j<2;j++)
				System.out.println("\t hi j : "+j);
				for(int k=0;k<2;k++)
					System.out.println("\t\t bye k : "+k);*/
	}

}
