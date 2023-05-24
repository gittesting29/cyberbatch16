package day21.superKeyword;
class Animal17
{
	void eat()
	{
		System.out.println("Animal eat");
	}
}
class Dog17 extends Animal17
{
	void eat() {
		System.out.println("Dog eat");
	}
	void bark() {
		System.out.println("Dog bark");
	}
	void work() {
		super.eat();
		bark();
		eat();
		System.out.println("Dog work");
	}
}


public class Super2 {

	public static void main(String[] args) {
		Dog17 d=new Dog17();
		d.work();
	}

}
