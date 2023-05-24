package assignmentsArrays;
import java.util.Arrays;

public class CheckArrayElements {

	public static void main(String[] args) {
		int[] empIds= {1,2,3,4,5,6,7,8,9};
		System.out.println("Using clone method of userdefined array....");
		int[] clonedArr=empIds.clone();
		for(int s:clonedArr)
			System.out.print(s+" ");
		System.out.println("\n");
		
		System.out.println("Using copyOf method of Arrays class....");
		int[] clonedArr1=Arrays.copyOf(empIds, 2);
		for(int s:clonedArr1)
			System.out.print(s+" ");
		System.out.println("\n");

		System.out.println("Using copyOfRange method of Arrays class....");
		int[] clonedArr2=Arrays.copyOfRange(empIds, 0, empIds.length);
		for(int s:clonedArr2)
			System.out.print(s+" ");
		
		
	}

}
