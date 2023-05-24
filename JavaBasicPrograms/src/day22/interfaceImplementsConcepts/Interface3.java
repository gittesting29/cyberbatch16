package day22.interfaceImplementsConcepts;
interface Printable
{
	int age=30;			//by default public static and final
	void print();
}
interface Showable
{
	public void show();
}
public class Interface3 implements Printable, Showable
{
	public static int age=45;
	public void print()
	{
		System.out.println("Hello print...");
	}
	public void show()
	{
		System.out.println("Hello show....");
	}
	public static void main(String[] args) 
	{
		Interface3 obj=new Interface3();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
		System.out.println(Interface3.age);	
	}

}
