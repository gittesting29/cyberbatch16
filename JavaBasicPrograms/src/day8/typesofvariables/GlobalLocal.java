package day8.typesofvariables;
/*LOCAL VARIABLES::::::::
 * variable declared inside method / constructor /block body known as local variable
 * we dont use static keyword with local variable.
 * these variable wont get separate memory for storage.
 * these variables are not accessible from outside the method/constructor body.
 * 
 * GLOBAL VARIABLES::::::
 * variables declared outside the method/constructor body but present in class body known as global variable
 * TYPES::: static global variable and non-static global variable */

public class GlobalLocal 
{
	static int age=25; //static global variable always declared with static keyword
	double salary=95000; //non static global variable
	
	public static void main(String[] args) 
	{
		int x=10,y=25;
		int res=x+y;
		System.out.println(res);
		
	}

}
