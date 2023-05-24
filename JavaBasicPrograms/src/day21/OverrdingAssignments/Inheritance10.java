package day21.OverrdingAssignments;
class Company 
{
	static int code;
	String name;		//global variable
	Company()
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
class Employee extends Company 
{
	int code;
	String name;
	Employee()
	{
		super();
		name="Advik Rathod";
	}
	@Override
	void Display()
	{
		super.Display();
		System.out.println("Comapny Code = "+Company.code);
		System.out.println("Employee Code = "+this.code);
		System.out.println("Employee Name = "+this.name);
	}
	
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
}

public class Inheritance10 
{

	public static void main(String[] args) 
	{
		System.out.println("********** Main Starts ************");
		Company c1=new Employee();
		
		c1.Display();
		//access all the above class members
	}

}
