package day20.Inheritance;
class Grandfather1
{
	Grandfather1()
	{
		System.out.println("Grandfather constructor...");
	}
	void myHome()
	{
		System.out.println("Grandfather home...");
	}
}

class Father1 extends Grandfather1
{
	Father1(double d)
	{
		System.out.println("Father constructor...");
	}
	void myCar()
	{
		System.out.println("Father car...");
	}
}

class Child1 extends Father1
{
	Child1(int i)
	{
		super(12.34);
		System.out.println("Child constructor...");
	}
	void myBike()
	{
		System.out.println("Child bike...");
	}
}
public class Inheritance6 {

	public static void main(String[] args) 
	{
		Child1 c=new Child1(21);	//child class can access all members of parents
		c.myHome();
		c.myCar();
		c.myBike();
		System.out.println("****************************************");
		
		Father1 f=c;  //we used reference here as child class object is already created using 
		//that object as a reference we can access only Father class members without using new memory
		f.myHome();
		f.myCar();
		System.out.println("****************************************");

		Grandfather1 g=c;
		g.myHome();
		System.out.println("****************************************");

	}

}
