package day21.overriding;
/**
When we declare a method in child class which is already declared
in parent class then it is called as method overriding.
  
  *Overriding:
  *this happens between classes which are involved in inherited
  *only non static methods can be overriden.
  *private, final and static methods can't be overriden
  *constructors can not be overriden
 
 while overriding methods we can only increase the visibility of members 
 default----->we can increase by making it default---protected--public
 protected--->we can increase by making it protected--public
 public------>public
 protected can'i be overrriden.
*/
class Animal
{
	Animal(){}
	public void move()
	{ 
		System.out.println("Animals can move");
	}
}
class Dog extends Animal
{
	Dog()
	{super();}
	@Override
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
public class Overriding1 
{
	public static void main(String[] args) 
	{		
		Animal a=new Animal();
		a.move();
		Dog d=new Dog();
		d.move();
		d.bark();
		
		Animal a1=new Dog();
		a1.move();	
	}
}
