package day22.abstraction;
abstract class Animal
{
	public abstract void animalSound();//abstract method
	public void sleep()
	{
		System.out.println("Zzzzz");
	}
}
class Pig extends Animal
{
	public void animalSound()		//subclass should implement abstract method ow it becomes abstract too
	{
		System.out.println("The pig says : wee wee");
	}
}
class Dog extends Animal
{
	public void animalSound()		//subclass should implement abstract method ow it becomes abstract too
	{
		System.out.println("The dog says : bow bow");
	}
}
public class abstractClass {

	public static void main(String[] args) 
	{
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
		Dog d=new Dog();
		d.animalSound();
		d.sleep();
	}

}
