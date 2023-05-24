package day13.methodexamples;
/*when you want a method to return some values and that value need to be used for further operations 
 * then use any primitive data type as return type for a method
 * 
 * void---->  no need to return any value.
 * 			  no need to write return statement itself
 * 			  void method can't be written inside print()
 * 
 * other----> return statement is must.
 * 			  return value is based on return type.
 * 	          can be written inside print()
 * */
public class StaticMethodWithReturnType 
{
	static double getROI() 
	{
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	static double getROI(int p,int t,float r) 
	{
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}

	public static void main(String[] args) 
	{
		System.out.println("***********************************************\n");
		getROI(); //rate of interest is not printed so value can not be used. only stored in variable roi
		System.out.println("Rate of interest : "+getROI()); //now value will print
		double x= getROI();
		double finalAmountToBePaid=55000+x;
		System.out.println("Total amount including interest : "+finalAmountToBePaid);
		
		System.out.println("***********declaring variables and used as Parameters***********");
		int amount=95000;;
		int duration=2;
		float roi=4.5f;
		double interest=getROI(amount,duration,roi);
		double finalAmount=amount+interest;
		System.out.println("Total amount paid by you : "+finalAmount);
		
		System.out.println("***********Using Parameters***********");
		interest=getROI(95000,2,4.5f);
		finalAmount=amount+interest;
		System.out.println("Total amount paid by you : "+finalAmount);
	}

}
