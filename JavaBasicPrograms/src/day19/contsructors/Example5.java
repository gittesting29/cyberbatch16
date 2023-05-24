package day19.contsructors;
class B
{
	int i=20;
	B()
	{
		System.out.println("Running class B constructor");
		i=13;
	}
}

public class Example5
{

	public static void main(String[] args) 
	{
		System.out.println("Main() of Example5 is started...");
		B b1=new B();
		b1.i=55;
		System.out.println("Class B global variable="+b1.i);
		System.out.println("*************************************************");
		
		B b2=new B();
		System.out.println("Class B global variable="+b2.i);
		System.out.println("*************************************************");

	}

}
