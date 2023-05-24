package day20.Inheritance;
class A1
{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1
{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1
{
	static int p=50;
	int q=60;
	double r=66.45;
}
public class Inheritance1
{

	public static void main(String[] args) 
	{
		System.out.println("Accessing Static members using class name....");

		System.out.println("Static members of class A1 : a : "+A1.a);
		System.out.println("Static members of class B1 : x : "+B1.x);
		System.out.println("Static members of class C1 : p : "+C1.p);
		
		System.out.println("Accessing Non Static members using C1 class....");
		C1 c=new C1();
		System.out.println("Class A1 Non static members : b : "+c.b+"\t c : "+c.c);
		System.out.println("Class B1 Non static members : y : "+c.y+"\t z :"+c.z);
		System.out.println("Class C1 Non static members : q : "+c.q+"\t r :"+c.r);


		System.out.println("Accessing Non Static members using B1 class....");
		B1 b=new B1();
		System.out.println("Class A1 Non static members : b : "+b.b+"\t c : "+b.c);
		System.out.println("Class B1 Non static members : y : "+b.y+"\t z :"+b.z);
	}

}
