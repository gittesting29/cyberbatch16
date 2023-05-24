package assignmentsArrays;

import java.util.Scanner;

public class NumberElementsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elemets:");
		int[] a=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("User array:");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nNumber of elements in array : "+a.length);
	}

}
