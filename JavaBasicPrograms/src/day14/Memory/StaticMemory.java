package day14.Memory;

public class StaticMemory 
{
	static int age=25,salary;
	static void display()
	{
		System.out.println("Salary : "+salary); //0
		int salary=25000;
		System.out.println("Salary : "+salary);//25000
		System.out.println("Satic global salary : "+StaticMemory.salary);//0
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Satic global age :"+age);//25
		int age=10;
		System.out.println("Age : "+age);//10
		System.out.println("Static global variable : "+StaticMemory.age);//25
		
		display();

	}

}
