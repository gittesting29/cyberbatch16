package assignmentsArrays;

public class CopyArray {
	public static void main(String[] args) {
		char[] o= {'a','s','k','k'};
		System.out.print("Original array: :");
		for(char i:o)
			System.out.print(i);
		System.out.println();
		
		char[] d=new char[o.length];
		for(int i=0;i<d.length;i++)
		{
			d[i]=o[i];
		}
		System.out.print ("Duplicate array: : ");
		for(char c1:d)
		{
			System.out.print(c1);
		}
	}

}
