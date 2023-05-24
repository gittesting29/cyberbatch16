package assignmentsOnDatatypes;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter initial principal balance : ");
		int p=sc.nextInt();
		System.out.println("Enter initial annual interest rate : ");
		double r=sc.nextDouble();
		System.out.println("Enter time in years : ");
		int t=sc.nextInt();
		System.out.println("Simple Interest : "+((p*r*t)/100));
		
	}

}
