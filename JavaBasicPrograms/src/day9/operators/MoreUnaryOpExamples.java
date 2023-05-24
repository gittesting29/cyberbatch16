package day9.operators;

public class MoreUnaryOpExamples {

	public static void main(String[] args) 
	{
		int a=-95,b;
		b=a++; 		// b=-95  a=-94
		int x=a,y;	// x=-94
		System.out.println("x=: " + x); //-94
		y=++x;		// -93
		System.out.println("*********************");
		System.out.println("a=: " + a); //-94
		System.out.println("b=: " + b); //-95
		System.out.println("x=: " + x); //-93
		System.out.println("y=: " + y); //-93
		System.out.println("*********************");
		int p=15, q=30, res;
		res=p++ +--q;	//44
//initial	15		30
//final		16		29
		System.out.println("res=: " + res); //44
		System.out.println("p=: " + p); //16
		System.out.println("q=: " + q); //29
		System.out.println("*********************");
		
		int res1=++p + ++q;		//47
		//initial	16		29
		//final		17		30	
		System.out.println("res1=: " + res1); //47
		System.out.println("p=: " + p); //17
		System.out.println("q=: " + q); //30
		System.out.println("*********************");
		
	}

}
