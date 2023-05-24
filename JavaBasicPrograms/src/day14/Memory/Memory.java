package day14.Memory;

public class Memory 
{
	static int salary;
	int empId;
	void display()
	{
		System.out.println("Display method.");
	}
	static void print()
	{
		System.out.println("Print Method.");
	}
	public static void main(String[] args) 
	{
		System.out.println("Accessing Static Members");
		System.out.println("Static variable salary--->"+salary);
		print();
		System.out.println("Accessing Non Static Members");
		
		Memory m=new Memory();
		m.display();
		System.out.println("non static empId---->"+m.empId);
		
		System.out.println("Update Static Members");
		salary=25000;
		System.out.println("Updated static variable salary--->"+salary);
		
		System.out.println("Update Non Static Members");
		m.empId=2001;
		System.out.println("Updated non static variable empId--->"+m.empId);
		
		Memory m1=new Memory();
		System.out.println("Createing new copy of empId.");
		System.out.println("Updated non static variable empId--->"+m1.empId);
		
	}

}
