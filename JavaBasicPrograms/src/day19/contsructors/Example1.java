package day19.contsructors;

/*every call has a constructor
 * it is similar to method
 * but its name should be same as class name
 * and it will not have any return type and it wont return any value to JVM
 * constructor will be called whenever class object is created.
 * constructor is used to initialize non static members of the class.
 * there are two types of constructor
 * 1. default constructor --------> a. when class doesn't have any constructor then java compiler 
 * 							  		     write a compiler which is known as default constructor.
 * 							   		  b.it doesn't have any parameters and its body will be empty.
 * 2. user defined constructor----> a. when a programmer writes a constructor then it is known as user defined constructor.
 * 										
 * */
public class Example1 
{
	int age=20;
	
	void display()
	{
		System.out.println("hi, i am display method.");
	}

	public static void main(String[] args) 
	{
		Example1 obj=new Example1(); //default constructor will be called
		System.out.println(obj.age);
		obj.display();		
	}

}
