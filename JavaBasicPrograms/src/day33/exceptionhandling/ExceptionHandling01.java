package day33.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling01 {

	public static void main(String[] args) 
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number : ");
		i=sc.nextInt();
		System.out.println("enter second number : ");
		j=sc.nextInt();
		k=i/j;
		System.out.println("Result : "+k);
	}

}
