package day12.switchcase;


public class ArithmeticOp {

	public static void main(String[] args) 
	{
		int num1=10, num2=20, res;
		char op='+';
		switch(op)
		{
			case '+':
				res= num1+num2;;
				System.out.println("Addition = "+res);
				break;
			case '-':
				res= num1-num2;;
				System.out.println("Subtraction = "+res);
				break;
			case '*':
				res= num1*num2;;
				System.out.println("Multiplication = "+res);
				break;
			case '/':
				res= num1/num2;;
				System.out.println("Division = "+res);
				break;
			case '%':
				res= num1%num2;;
				System.out.println("Modulus = "+res);
				break;
		}

	}

}
