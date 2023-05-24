package day21.blocks;

public class DemoBlock {
	final static  int age;
	final double salary;
	static {
		System.out.println("Static block will execute before main()..");
		age=45;}
	{
		System.out.println("NOn Static block will execute as soon as object is created..");
		salary=450000;}
	public static void main(String[] args) {
		System.out.println("Main starts here.........");
		System.out.println("Satic variable= "+DemoBlock.age);
		DemoBlock d=new DemoBlock();
		System.out.println("Non static variable= "+d.salary);
		System.out.println("Main ends here.........");

	}

}
