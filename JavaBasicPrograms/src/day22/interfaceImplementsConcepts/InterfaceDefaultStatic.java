package day22.interfaceImplementsConcepts;
interface Drawable8
{
	void draw();//by default public abstract
	default void msg() { System.out.println("Default method in interface Drawable..");}
	static int cube(int x)
	{
		return x*x*x;
	}
	//we can't use default and static together
	//default static int print() {
	//	System.out.println("default static method of interface");
	//} 
	//private methods allowed in jdk9
}
class Rectangle2 implements Drawable8
{
	public void draw()
	{
		System.out.println("Drawing rectangle..");
	}
}
public class InterfaceDefaultStatic 
{
	public static void main(String[] args) {
		Drawable8 d=new Rectangle2();
		d.draw();
		d.msg();
		System.out.println(Drawable8.cube(3));
	}
}
/**
 from jdk8 we can have complete/non abstract method also but those methods
 should be declared with default or static
 */
