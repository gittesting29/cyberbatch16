package day9.operators;

public class Arithmetic {

	public static void main(String[] args) {
int num1=50,num2=15;
		
		System.out.println("**********Addition***********");
		int result=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Addition is  : "+result+"\n\n");
		
		//subtraction re-initialization of result variable
		System.out.println("**********Subtraction***********");
		result=num1-num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Substraction is  : "+result+"\n\n");
		
		//multiplication
		System.out.println("**********Multiplication***********");
		num1=15;
		num2=5;
		result=num1*num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Multiplication is  : "+result+"\n\n");
		
		//division
		System.out.println("**********Division***********");
		num1=100;
		num2=11;
		result=num1/num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division is  : "+result+"\n\n");
		
		//modulus
		System.out.println("**********Modulus***********");
		num1=100;
		num2=11;
		result=num1%num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Modulus is  : "+result+"\n\n");
		
		

	}

}
