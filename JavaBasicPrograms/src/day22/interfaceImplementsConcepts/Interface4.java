package day22.interfaceImplementsConcepts;
interface Printable1
{
	void print();
}
interface Showable1
{
	void print();
}
public class Interface4 implements Printable1 , Showable1
{
	public void print()
	{
		System.out.println("hello.....");
	}
	public static void main(String[] args) {
		Interface4 obj=new Interface4();
		obj.print();
		Showable1 s=new Interface4();
		s.print();
		Printable1 p=new Interface4();
		p.print();
	}

}
