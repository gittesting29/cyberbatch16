package assignmentsAllConcepts;

//assignment no. 1

public class AllConcepts 
{
		int a;					//non-static global variable
		static float b;		//static global variable
	
		static					// static block 
		{
			System.out.println("Static block executes before main method.... ");
			b=80000.00f;	//static members accessed directly
			System.out.println("***************************************************************");
		} 
		{						//non-static block
			System.out.println("Non static block execute before constructor.");
			System.out.println("Used to provide additional information to object before it get created. ");
			a=34;				//non static members accessed directly
			System.out.println("***************************************************************");
		}
		static
		{
			System.out.println("2nd static block will execute simultaneosly one by one before main().");
			System.out.println("***************************************************************");
		}
		
		public int Add(int a,int b)// method or function ---> can have static or non-static method with local variables
		{
			int c=a+b;
			this.a=a;
			AllConcepts.b=b;
			
			System.out.println("Updated GV a="+this.a);						//this keyword
			System.out.println("Updated GV b="+AllConcepts.b);
			return c;
		}
		public void Add()//method overloading
		{
			int a=90,b=78;
			int c=a+b;
			System.out.println("Addition of two numbers="+c);
			System.out.println("***************************************************************");
		}
		{
			System.out.println("2nd non static block..");
			System.out.println("***************************************************************");
		}
		AllConcepts()		//constructor
		{
			this(8);		//this() statement
			System.out.println("this() will call another constructor depending on parametrer passed..");
			System.out.println("***************************************************************");
		}
		AllConcepts(int i)		//constructor overloading
		{
			System.out.println("Value initialised by parameterised constructor\n i="+i);	
			System.out.println("***************************************************************");
		}
		
		public static void Demo()
		{
			System.out.println("This is static method....");
			System.out.println("***************************************************************");
		}
				
		public static void main(String[] args) 
		{
			System.out.println("*********************Main execution starts*********************");
			int a=20,b=40;
			System.out.println("Local in main a="+a+" b="+b);
			System.out.println("***************************************************************");
			AllConcepts obj=new AllConcepts();
			System.out.println("***************************************************************");

			System.out.println("Addition using method="+obj.Add(23,34));
			System.out.println("***************************************************************");

			AllConcepts obj2=new AllConcepts(80);
			System.out.println("***************************************************************");

			AllConcepts.Demo();
			System.out.println("*****************************Main ends here**********************");
		}
		static
		{
			System.out.println("this static block is defined after main() method but will execute main logic excution.");
		}
}