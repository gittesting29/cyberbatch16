package day20.Inheritance;
class Vehicle
{
	public void wheels()
	{
		System.out.println("I have wheels..");
	}
}
class Bike extends Vehicle
{
	public void countwl()
	{
		System.out.println("I am bike has 2 wheels..");
	}
}
class Car1 extends Vehicle
{
	public void countwlc()
	{
		System.out.println("I am car and has 4 wheels..");
	}
}
class Scooter extends Vehicle
{
	public void countwls()
	{
		System.out.println("I am scooter and 2 wheels..");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		Car1 c=new Car1();	//can access Car1 and Vehicle members as Car1 inherits class Vehicle
		c.wheels();			//Vehicle method
		c.countwlc();		//Car1 method
		
		Bike b=new Bike();  //can access Bike and Vehicle members as Bike inherits class Vehicle
		b.wheels();
		b.countwl();
		
		Scooter s=new Scooter(); //can access Scooter and Vehicle members as Bike inherits class Vehicle
		s.wheels();
		s.countwls();
				
	}

}
