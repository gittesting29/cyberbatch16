package day20.Inheritance;

class Fruit
{
	Fruit()
	{
		System.out.println("Fruit class constructor....");
	}
	public void taste()
	{
		System.out.println("Fruits are sweet...");
	}
}

class Apple extends Fruit
{
	Apple()
	{
		super();    //if note written java compiler will write it
		System.out.println("Apple class constructor...");
	}
	public void shape()
	{
		System.out.println("Apple is round.");
	}
}

public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Apple a=new Apple();
		a.taste();
		a.shape();
	}

}
