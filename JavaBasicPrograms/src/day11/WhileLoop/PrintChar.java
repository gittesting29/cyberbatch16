package day11.WhileLoop;

public class PrintChar {

	public static void main(String[] args)
	{
		char c1='a';
		while(c1<='z') 
		{
			System.out.print(c1 +" ");
			c1++;
		}
		System.out.println();
		char c2='z';
		while(c2>='a')
		{
			System.out.print(c2+" ");
			c2--;
		}

	}

}
