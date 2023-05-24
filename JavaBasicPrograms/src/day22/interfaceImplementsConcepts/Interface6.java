package day22.interfaceImplementsConcepts;
/**
 * Interface only contains methods without body
 * we can declare variables inside interface
 * by default variables declared are public static final
 */
interface Animal
{
	int age=20;
	public void animalSound();//interface method does not have body
	public void sleep();
}
class Pig implements Animal
{
	public void animalSound()
	{
		System.out.println("Pig says wee wee.");
	}
	public void sleep()
	{
		System.out.println("Zzzzzz");
	}
}
public class Interface6 
{
	public static void main(String[] args) 
	{
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
		System.out.println(Animal.age);
	}
}
