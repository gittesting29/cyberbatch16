package day17.thiskeyword;

class Test
{
	void m()
	{
		System.out.println("In method m().");
	}
	void n()
	{
		System.out.println("In method n().");
		this.m();
	}		
}

public class Example3 
{
	void method1()
	{
		System.out.println("In method1().");
	}
	void method2()
	{
		System.out.println("In method2().");
		this.method1();
	}
	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.method2();
		
		Test t=new Test();
		t.n();
	}
}
