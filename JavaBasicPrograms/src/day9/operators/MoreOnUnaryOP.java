package day9.operators;

public class MoreOnUnaryOP 
{

	public static void main(String[] args) 
	{
		int a=-1, b;
		b=a++ + ++a + ++a + a;
//initial -1	1		2	2
//final	   0	1		2	2

		System.out.println("a=: " + a); //2
		System.out.println("b=: " + b); //4
		System.out.println("*********************");
		
		a=7;
		b=a-- + --a + --a + a;
//initial 7		5		4	4
//final	  6 	5		4	4

		System.out.println("a=: " + a); //4
		System.out.println("b=: " + b); //20
		System.out.println("*********************");
				
		a=-5;
		b=a-- + --a + --a + a + ++a + a++;
//initial  -5	-7	   -8   -8   -7   -7
//final	   -6	-7	   -8	-8   -7   -6

		System.out.println("a=: " + a); //-6
		System.out.println("b=: " + b); //-42
		System.out.println("*********************");
				
				
		
	}

}
