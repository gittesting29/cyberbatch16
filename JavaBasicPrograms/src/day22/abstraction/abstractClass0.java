package day22.abstraction;
/**
*-class declared with abstract keyword known as abstract class,0 to 100% abstract
 -it will have---- 
   1. abstract method--------->method declared with abstract keyword without body
   2. non-abstract methods---->normal method / concrete method
   3. constructor
   4. static method
   5. global variable
 -abstract class object can't be create as its incomplete class
 -if any class contains even one abstract method then that class should be declared 
 	as abstract class.
 -when an abstract class is getting inherited by a sub class, then there will a contract 
 	between these classes that subclass needs to override all the abstract method of
 	abstract class(super class) otherwise subclass becomes abstract class.
 */

abstract class Demo3
{
	abstract void print();		//abstract method / incomplete method
	void display()				//normal or non abstract or concrete method or complete meyhod 
	{
		System.out.println("I am non abstract method display().");
	}
}
abstract class Demo	//0% abstract
{
	void display()
	{
		System.out.println("I am non abstract method display().");
	}
	void display2() 
	{
		System.out.println("I am a non abstract method dispaly2().");
	}
}
abstract class Demo2	//100%abstract
{
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class abstractClass0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abstract classes can't be instantiated

	}

}
