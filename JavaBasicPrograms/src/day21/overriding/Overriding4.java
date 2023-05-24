package day21.overriding;
class ABC {
	void myMethod() {
		System.out.println("method of ABC class");
	}
}

public class Overriding4 extends ABC{
	public void myMethod() //using override methods we can visibility of cod
	// here default method in parent override as public method in base
	{
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}

}
