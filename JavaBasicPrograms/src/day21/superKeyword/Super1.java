package day21.superKeyword;
class Animal16
{
 String color="white or red";	
}
class Dog16 extends Animal16
{
	String color="black";
	void printcolor()
	{
		System.out.println("Dog color is="+color);
		System.out.println("Animal color is="+super.color);
	}
}
public class Super1 {

	public static void main(String[] args) {
		Dog16 d=new Dog16();
		d.printcolor();
		
		//String s1="12 servers";
		
}

}
