package day22.interfaceImplementsConcepts;
/**
 Interface is used to achieve abstraction in java.
 Java doesn't support multiple inheritance so to overcome this we can use interface
 in interface we can use only abstract methods, non abstract methods are not written in interface.
 in interface we can have variables,methods but we can't have constructor in it.
 	- Variables are by default public, static, final 
 	- Methods are by default and abstract
 we can not create instance of interface because it is incomplete
 * when subclass inherits interface it uses implements keyword and subclass should
 	override all the methods otherwise subclass also becomes abstract.
 * when one interface inherits another interface it uses extends keyword.
 
 POINTS TO REMEBER
 	1. two classes we use 'extends'
  	2. two interface we use 'extends' 
  	3. class and interface use 'implements' 
 */

interface i
{
	//in interface we can not have constructor
	//variables declared are by default public static and final
	//methods declared are public and abstract
	//methods are only abstract no any non-abstract method can be used.
}

interface Drawable 
{
	int salary=250000;	//becomes public,static and final
	void draw();		//public and abstract
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing recatngle....");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing circle....");
	}
}
public class Interface1 {

	public static void main(String[] args) 
	{
		System.out.println("**********Program starts*********");
		System.out.println("Interface variable salary : "+Drawable.salary);
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
		Drawable d=new Circle();
		d.draw();
		Drawable d1=new Rectangle();
		d1.draw();
		System.out.println("**********Program ends*********");

	}
}
