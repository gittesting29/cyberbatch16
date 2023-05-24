package day33.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		//1. abnormal statement
		int i=10;
		int j=i/0;	//Arithmetic exception
		System.out.println("Result : "+j);
		
		//2. abnormal statement
		int empId[]=new int[3];
		empId[3]=103;//ArrayIndexOutOfBounds
		
		//3. abnormal statement
		String str=null;
		System.out.println(str.length());//NullPointerException
		
		//4. abnormal statement
		String s="abc";
		int num=Integer.parseInt(s);//NumberFormatException
		System.out.println("Number : "+num);
		

	}

}
