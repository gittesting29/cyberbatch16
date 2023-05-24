package assignmentsOnDatatypes;
import java.util.*;
public class MathsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input first number :");
		int a=sc.nextInt();
		System.out.print("Input second number: ");
		int b=sc.nextInt();
		System.out.println("\t\tExpected Output: ");
		System.out.println("\t\t125 + 24 = "+(a+b));
		System.out.println("\t\t125 - 24 = "+(a-b));
		System.out.println("\t\t125 * 24 = "+(a*b));
		System.out.println("\t\t125 / 24 = "+(a/b));
		System.out.println("\t\t125 % 24 = "+(a%b));
	}

}
