package day20.Inheritance;

class Grandfather
{
	Grandfather()
	{
		System.out.println("Grandfather constructor...");
	}
	void myHome()
	{
		System.out.println("Grandfather home...");
	}
}

class Father extends Grandfather
{
	Father(double d)
	{
		System.out.println("Father constructor...");
	}
	void myCar()
	{
		System.out.println("Father car...");
	}
}

class Child extends Father
{
	Child(int i)
	{
		super(12.34);
		System.out.println("Child constructor...");
	}
	void myBike()
	{
		System.out.println("Child bike...");
	}
}
public class InheritanceUsingReference 
{
	public static void main(String[] args) 	
	{
		System.out.println("**********************************");
		Child c1=new Child(23);
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("**********************************");
// creating an object of derived class and referred by its parent
//Father f1=new Child(); or Father f2=new Father();
		Father f1=c1;	//Father f1=new Child(21);
						//home, car but bike will not to visible to father
		f1.myCar();
		f1.myHome();
//f1.myBike(); shows error only reference is created with Father class so Father class and its super class access
		
	}

}
