package assignmentsArrays;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		int a[]= {11,12,13,14,14,12,13,16,15};
		System.out.println("Array elements are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n\nDuplicate values are : ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
	}

}
