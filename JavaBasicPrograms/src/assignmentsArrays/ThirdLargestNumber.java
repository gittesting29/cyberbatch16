package assignmentsArrays;

public class ThirdLargestNumber {

	public static int get3rdLargest(int a[], int total)
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
		return a[total-3];
	}
	public static void main(String[] args) {
	int arr[]= {12,100,23,45,1211,18,89,78,1000};
	System.out.println("Third Largets is: "+ThirdLargestNumber.get3rdLargest(arr,9));
	}

}
