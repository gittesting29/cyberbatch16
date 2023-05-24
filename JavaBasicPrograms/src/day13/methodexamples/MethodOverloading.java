package day13.methodexamples;

/* when we declare same method multiple times in the same class with different type of parameters then this concept is known as method overloading.
 * Rule of method overloading----->
 * 1. different in number of arguments
 * 2. different in type of argument
 * 3. different in position of argument
 * 
 *static/ non static:
 *		way to access
 *		check return type id required or not
 *		check in position of argument
 */
public class MethodOverloading 
{
	double addNumber()
	{
		int num1=90, num2=30, res;
		res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		return res;
	}
	double addNumber(int num1, int num2)
	{
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		return(num1+num2);
	}
	double addNumber(double num1, int num2)
	{
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		return(num1+num2);
	}
	double addNumber(int num1, double num2)
	{
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		return(num1+num2);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.addNumber());
		System.out.println("***********************1************************\n");
		
		System.out.println(obj.addNumber(25,53));
		System.out.println("***********************1************************\n");

		System.out.println(obj.addNumber(53.45,56));
		System.out.println("***********************1************************\n");

		System.out.println(obj.addNumber(45,56.33));		
		System.out.println("***********************1************************\n");

		System.out.println(obj.addNumber());
		System.out.println("***********************1************************\n");		
		System.out.println("***********************1************************\n");

	}

}
