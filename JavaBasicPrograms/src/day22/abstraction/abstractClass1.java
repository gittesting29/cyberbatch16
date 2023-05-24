package day22.abstraction;
abstract class Bike1
{
	abstract void run();
	void speed(int spd) {System.out.println("Bike speed:"+spd);}
}
class Honda4 extends Bike1
{
	void run()
	{
		System.out.println("Running safely.");
	}
	void speed(int spd)
	{
		System.out.println("Honda4 speed= "+spd);
		super.speed(120);
	}
	void color()
	{
		System.out.println("Honda4 color is blue.");
	}
}

class abstractClass1 {

	public static void main(String[] args) 
	{
		Honda4 obj=new Honda4();
		obj.run();
		obj.speed(56);
		obj.color();
		//Bike1 b1=new Bike1()    we can't create object of abstract class.
		Bike1 b2=new Honda4();
		b2.run();
		b2.speed(20);
		//b2.color() we can't access color() as it is a method of child class and we have created reference of parent class
		

	}

}
