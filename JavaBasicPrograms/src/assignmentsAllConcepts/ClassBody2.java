package assignmentsAllConcepts;

//assignment no. 2

class Demo
{
	static int a=100;		//static global variable
	int b=200;				//non static global variable
	static 					//static block
	{
		a=1000;
		System.out.println("class Demo : First static block..prints value a="+a);
	}
	{						//non static block
		b=2000;
		System.out.println("class Demo : first non static block...prints value b="+b);
	}
	
	static void Display()	//static method
	{
		System.out.println("class Demo : this is static method display() call");
	}
	void Accept(int a, int b)	//non static method
	{
		System.out.println("Demo Class : Local values from Accept metod are a="+a+"\tb="+b);				
	}
	
	static int Accept()			//method overloading
	{
		int q=56;
		return q;
	}
	
}
public class ClassBody2 
{
	int age=35;
	static int salary=350000;
	static 
	{
		System.out.println("class ClasBody2 : first static block..");
	}
	{
		System.out.println("class ClasBody2 : first non static block..");		
	}
		
	static void Addition(int a, int b)
	{
		System.out.println("class ClassBody : Addition using static method="+(a+b));
	}
	
	int Addition()
	{
		int a=34;
		int b=34;
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		int salary=560000;
		int age=56;
		System.out.println("access all the members of ClassBody2 class");	
		System.out.println("Global static variable : "+ClassBody2.salary);
		System.out.println("Local salary : "+salary);
		
		ClassBody2 obj1=new ClassBody2();
		System.out.println("Global non static variale="+obj1.age);
		System.out.println("Local age : "+age);
		
		Addition(50,50);
		obj1.Addition();
		
		System.out.println("**********************************************\n");
		
		System.out.println("access all the members of Demo class");
		int a=1,b=2;
		System.out.println("Class Demo : Local a="+a+"\t b="+b);
		System.out.println("Class Demo : Gloabal a="+Demo.a);		
		Demo d1=new Demo();
		System.out.println("b="+d1.b);
		
		Demo.Display();
		System.out.println(Demo.Accept());
		d1.Accept(3, 4);		
	}
}