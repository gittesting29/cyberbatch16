package assignmentsArrays;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elemts in array : ");
		int l=s.nextInt();
		System.out.println("Ener array elemets:");
		int[] a= new int[l];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("User array:");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Sum of array elements:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("\n\n Sum of array elements : "+sum);		
	}

}
