package assignmentsArrays;

public class LargestInArray {

	public static void main(String[] args) {
		int a[]= {11,12,13,78,14,15,16};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Largest Element : "+max);
	}

}
