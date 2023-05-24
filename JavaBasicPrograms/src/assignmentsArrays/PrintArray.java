package assignmentsArrays;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemts in array : ");
		int l=sc.nextInt();
		System.out.println("Ener array elemets:");
		int[] a= new int[l];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("User array:");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
