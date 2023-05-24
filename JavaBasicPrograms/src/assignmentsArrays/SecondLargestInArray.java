package assignmentsArrays;

public class SecondLargestInArray {
	public static int get2ndLargest(int a[], int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} 
			}
		}
		return a[total-2];
}
	public static void main(String[] args) 
	{
		int a[]= {211,11,42,38,78};
		System.out.println("Second Largest = "+SecondLargestInArray.get2ndLargest(a,5));
		
	}
}