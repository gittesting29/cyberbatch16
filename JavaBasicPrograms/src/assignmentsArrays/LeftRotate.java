package assignmentsArrays;

import java.util.Scanner;

public class LeftRotate {

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
		//number of rotation for array element
		int n=3;
		//logic to rotate array elements
		for(int i=0;i<n;i++)
		{
			int first=a[0],j;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;			
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
