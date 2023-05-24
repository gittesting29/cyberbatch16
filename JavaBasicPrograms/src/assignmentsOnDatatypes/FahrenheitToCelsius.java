package assignmentsOnDatatypes;

import java.util.Scanner;

// formula : celsius=(fahrenheit-32)*5/9
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value for fahrenheit tempearture : ");
		float f=sc.nextFloat();
		float c=(f-32) * 5 / 9;
		System.out.println("Converted temperature : "+c);
	}

}
