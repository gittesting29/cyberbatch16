package day33.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Array size: ");
		//int size=sc.nextInt();
		int a[] =new int[2];
		try {
			System.out.println("Entering try block..");
			System.out.println(a[3]);
			System.out.println("Exiting try block..");
		}
		catch(Exception e)
		{
			System.out.println("Entering catch block...");
			System.out.println("Printing stack trace....");
			e.printStackTrace();
			System.out.println("Printing exception....");
			System.out.println(e);
			System.out.println("Printing exception with message....");
			System.out.println(e.getMessage());
			
		}
		
	}

}
