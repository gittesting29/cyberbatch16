package day9.operators;

public class UnaryOp {

	public static void main(String[] args) 
	{
		int a=50;
		int b=a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int k= ++a;
		System.out.println("k = "+k);
		System.out.println("a = "+a);
		
		int j=k++;
		System.out.println("k = "+k);
		System.out.println("j = "+j);
		
		int r=-9;
		System.out.println("r="+ r++);//-9
		System.out.println("r="+ r);//-8
		
		System.out.println("r="+ ++r);//-7
		System.out.println("r="+ r);//-7
		
		int x=-9;
		System.out.println("x=: " + --x); //-10
		System.out.println("x=: " + x); //-10
		System.out.println("x=: " + x--); //-10    then -11
		System.out.println("x=: " + x); //-11
		}

}
