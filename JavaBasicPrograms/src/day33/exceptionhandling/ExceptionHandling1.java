package day33.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number : ");
		i=sc.nextFloat();
		System.out.println("enter second number : ");
		j=sc.nextFloat();
		try {
			System.out.println("Inside try block.......");
			k=i/j;
			System.out.println("Result : "+k);
		}catch(ArithmeticException e)
		{
			System.out.println("Inside catch.......");
			System.out.println("Exception msg : "+e.getMessage());
			System.out.println("Exception name AND msg : "+e);

		}
	}

}
