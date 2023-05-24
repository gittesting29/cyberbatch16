package day17.Pyramids;

public class Pyramids {

	public static void main(String[] args) 
	{

		for(int i=1;i<5;i++)  //first for loop number of lines in pyramid
		{
			for(int j=1;j<=i;j++)//inner for loop number of pattern in pyramid
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(char i='A';i<'F';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(char i='A';i<'F';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(char i='a';i<'f';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------*********---------------------");
		for(int i=5;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

}
}