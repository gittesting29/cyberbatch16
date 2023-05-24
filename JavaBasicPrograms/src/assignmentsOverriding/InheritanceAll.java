package assignmentsOverriding;

class Company11 
{
	static int code;
	String name;		//global variable
	Company11()
	{
		code=10001;
		name="MicroSoft";
	}
	void Display()
	{
		System.out.println("Comapny Code = "+code);

		System.out.println("Company Name = "+name);
	}
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
}
// child class of Company
class Employee11 extends Company11 
{
	int code;
	String name;
	Employee11()
	{
		super();
		name="Advik Rathod";
	}
	@Override
	void Display()
	{
		super.Display();
		System.out.println("Comapny Code = "+Company11.code);
		System.out.println("Employee Code = "+this.code);
		System.out.println("Employee Name = "+this.name);
	}
	
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
}

public class InheritanceAll 
{

	public static void main(String[] args) 
	{
		System.out.println("********** Main Starts ************");
		Company11 c1=new Employee11();
		
		c1.Display();
		//access all the above class members
	}

}

