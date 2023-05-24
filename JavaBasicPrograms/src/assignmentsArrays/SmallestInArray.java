package assignmentsArrays;

public class SmallestInArray {

	public static void main(String[] args) {
		int a[]= {11,12,13,78,14,15,16,0};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest Element : "+min);
	}
}