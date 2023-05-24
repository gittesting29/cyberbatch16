package day8.typesofvariables;

/*Static Global Variable::::::::::::::
 * if the global variable is declared using static keyword then it is known as static global variable.
 * these variables are also known as class variable/class member
 * these variables will be loaded in the memory at the time of compilation when the class is generated 
 * they will not get separate memory locations
 * we can access static global variable from another static method directly.
 * we can access they variables using class name as they are class members.
 * eg. classname.staticglobalvariablename
 * if we declared static global variable but not initialized it then it will take default value according its data type.
 * static global variable will have single memory allocation throught the execution hence any changes in its value will change
 *  original value..*/

public class StaticGlobalVariable 
{
	static int num1,res;     //will take default value as it is only declared
	static int num2=25;            //will take 25 as it is declared + initialized
	public static void main(String[] args) 
	{
		System.out.println("Number 1 :"+ num1);   //or we can use StaticGlobalVariable.num1 according to standard
		System.out.println("Number 2 :"+ num2);
		res=num1+num2;
		System.out.println("Addition :"+ res);
		
		num1=75;
		System.out.println("Updated Number 1 :"+ num1);
		System.out.println("Number 2 :"+ num2);
		res=num1+num2;
		System.out.println("Addition :"+ res);
		
		num1=85; num2=65;
		System.out.println("Updated Number 1 :"+ num1);
		System.out.println("Updated Number 2 :"+ num2);
		res=num1-num2;
		System.out.println("Subtraction :"+ res);
	}

}
