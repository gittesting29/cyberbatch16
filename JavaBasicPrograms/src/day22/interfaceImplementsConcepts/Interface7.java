package day22.interfaceImplementsConcepts;
interface Animal21
{
	int age=20;//by default public static final
	public void animalSound();
	public void sleep(int i);
}
interface Reptile
{
	public void color();
}
class Pig21 implements Animal21
{
	public void animalSound()
	{
		System.out.println("The pig says wee wee..");
	}
	public void sleep(int k)
	{
		System.out.println("Zzzzzz");
	}
}
class Dog extends Pig21 implements Reptile
{
	public void color()
	{
		System.out.println("Color blue.");
	}
	public void animalSound()
	{
		System.out.println("The dog says bhow bhow...");
	}
}
public class Interface7 
{
	public static void main(String[] args) 
	{
		Pig21 p=new Pig21();
		p.animalSound();
		p.sleep(67);
		Dog d=new Dog();
		d.animalSound();
		d.sleep(78);
		d.color();
	}
}
