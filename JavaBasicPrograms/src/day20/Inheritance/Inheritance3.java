package day20.Inheritance;

class FourWheeler
{
	public void wheels()
	{
		System.out.println("I have 4 wheels.");
	}
}
class Car extends FourWheeler
{
	public void type()
	{
		System.out.println("I am car..");
	}
}
class Maruti extends Car
{
	public void company()
	{
		System.out.println("I am maruti");
	}
}
public class Inheritance3 
{

	public static void main(String[] args) 
	{
		Maruti m=new Maruti();
		m.wheels();
		m.type();
		m.company();
	}

}
