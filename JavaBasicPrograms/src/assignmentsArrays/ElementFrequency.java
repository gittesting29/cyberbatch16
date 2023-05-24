package assignmentsArrays;
import java.util.*;
public class ElementFrequency {

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
		
		//to store frequency of element
		int freq[]=new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++) 
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		System.out.println("\n *********** Elements Frequency ***********");
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
				System.out.println(a[i]+" "+freq[i]);
		}		
	}
}
