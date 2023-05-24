package day21.blocks;

public class NonStaticBlock {
	int age=55;
	double salary=9000.35;
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() Starts..");
		NonStaticBlock b1 = new NonStaticBlock();
		b1.print();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		print();
		age=25;
		salary = 45000.32;				
	}
}
