package day26.Arrays;

public class Array0 {

	public static void main(String[] args) {
		//String[] cars;
		//cars=new String[4];
		
		//0r
		//String[] cars=new String[4];
		//cars[0]="volvo";
		//cars[1]="BMW";
		//cars[2]="manza";
		String[] cars= {"Volvo","BMW","Ford","Manza"};
		System.out.println("Array lenght = "+cars.length+"\n");
		System.out.println("Using for loop......\n");
		for(int i=0;i<cars.length;i++)
		{System.out.println(cars[i]);}
		
		System.out.println("\nUsing foreach.....\n");
		for(String i:cars)
		{
			System.out.println(i);
		}
		
	}

}
