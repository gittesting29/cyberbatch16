package day8.typesofvariables;

/*NON STATIC GLOBAL VARIABLES:::::::::::::
 * global variable declared without static keyword is known as non static global variable or instance variable
 * these variables are loaded in the memory ata the time of execution or run time when an object is created
 * object---> it is real time entity which has its own behavior and state.
 * syntax to create object: 
 * class_name reference;				//object declared
 * reference= new class_name();			//object creation/initialization
 * OR::::: class_name reference= new class_name();
 * once the instance/object is of the class is created a copy of non-static member will be loaded into the memory.
 * for non static global variable we can have multiple allocation based on instance/object creation.
 * we can access non static global variable from another non static method directly.
 * standard to use it :::: referencevariable.nonstaticglobbalvariablename
 * a change in one instance or object will not have impact on another object/instance
 * */

public class NonStaticGlobalVariables 
{
	static int s=26;
	int b=10;
	public static void main(String[] args) 
	{
		System.out.println("Static value="+s);
		
		NonStaticGlobalVariables ref1=new NonStaticGlobalVariables();
		System.out.println("Non static value="+ref1.b);
		 
		s=67;
		ref1.b=87;
		System.out.println("Updated Static value="+s);
		System.out.println("Updated Non static value="+ref1.b);
		
		//lets create another copy of non static variable
		NonStaticGlobalVariables ref2=new NonStaticGlobalVariables();
		System.out.println("Static value="+s);
		System.out.println("Non static value="+ref2.b);
		}
}
