package day26.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int numbers[]= {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum=0;
		float average;
		int l=numbers.length;
		System.out.println("Array length="+l);
		for(int i:numbers)
		{
			sum=sum+i;
		}
		System.out.println("Addition = "+sum);
		average=(float)sum/l;
		System.out.println("Average = "+average);
		
	}

}
