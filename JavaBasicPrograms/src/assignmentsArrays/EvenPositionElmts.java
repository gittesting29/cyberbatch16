package assignmentsArrays;

import java.util.Scanner;

public class EvenPositionElmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("\n\n Elements on even position are : \n");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
			System.out.print(a[i]+" ");
		}
	}

}
