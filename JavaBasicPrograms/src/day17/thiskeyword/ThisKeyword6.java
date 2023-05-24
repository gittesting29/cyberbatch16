package day17.thiskeyword;

public class ThisKeyword6 {
	int variable = 95;
	void method(int variable) {
		System.out.println("Value of Local variable :" + variable);// 5
		variable = 80;
		System.out.println("Value of Local variable :" + variable);//80
		System.out.println("Value of Instance variable :" + this.variable);//95
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//80
		System.out.println("Value of Instance variable :" + this.variable);//80
	}
	void method() {
		int variable = 25;
		System.out.println("Value of Instance variable :" + this.variable);//80
		System.out.println("Value of Local variable :" + variable);//25
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//25
		System.out.println("Value of Instance variable :" + this.variable);//25
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword6 obj = new ThisKeyword6();
		obj.method(5);
		obj.method();
		System.out.println("Value of Instance variable :" + obj.variable);//25
	}

}
