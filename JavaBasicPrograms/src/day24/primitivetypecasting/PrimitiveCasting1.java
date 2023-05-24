package day24.primitivetypecasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		int myInt=9;	//implicit widening, java compiler writes double myDouble=(double)myInt;
		double myDouble=myInt;
		System.out.println("double value after assigning int value="+myDouble);
		double d=(double)myInt;//explicit widening ..we have written double in bracket so explicit
		System.out.println(myInt);
		System.out.println(d);
		
		double salary=234500.86976786d;
		System.out.println("Actual salary="+salary);
		int isal=(int)salary;//explicit narrowing
		long lsal=(long)salary;
		float fsal=(float)salary;
		System.out.println("Int salary = "+isal);
		System.out.println("Long salary = "+lsal);
		System.out.println("Float salary = "+fsal);
	}
}
