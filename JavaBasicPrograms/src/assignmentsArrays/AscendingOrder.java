package assignmentsArrays;

public class AscendingOrder {

	public static void main(String[] args) 
	{
		int a[]= {12,11,56,34,23,19,6,78};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\n Ascending Order :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
