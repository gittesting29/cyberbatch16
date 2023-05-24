package day20.Inheritance;
/* Inheritance:
 in order to achieve inheritance we need constructor chaining.
 * Constructor chaining: when subclass constructor calls superclass constructor and superclass constructor
 calls its superclass constructor then it is known as constructor chaining.
 * to achieve constructor chaining we need to use super() //super statement
 * super() is used to call parent class constructor based on parameter.
 * it should be the first statement inside constructor body.
*/

class Country
{
	Country(int i)
	{
		System.out.println("I am int parameter country constructor.");
	}
	void display() {System.out.println("I am display() of country.");}
}
class State extends Country
{
	State(){
	super(34);System.out.println("Explicitly calling baseclass constructor");}
	void calling() {System.out.println("I am calling() of state.");	}
}
public class Demo {

	public static void main(String[] args) {
		State s=new State();
		s.display();
		s.calling();

		State s1=new State();
		s1.display();
		s1.calling();
	}

}
