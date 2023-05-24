package day9.operators;

public class LogicalOp2 
{
	public static void main(String[] args)
	{
		int num1=5, num2=10;
		boolean res1,res2;
		res1=(num1!=num2);
		res2=(num1<num2);
		
		System.out.println("Result1 = "+res1);
		System.out.println("Result2 = "+res2);
		
		//logical AND
		System.out.println("Logical AND RESULT = "+(res1 && res2));	
		
		//logical OR
		System.out.println("Logical OR RESULT = "+(res1 || res2));
		
		//logical NOT
		System.out.println("Logical NOT RESULT = "+ !(res1 && res2));
	}

}
