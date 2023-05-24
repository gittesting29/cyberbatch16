package day17.thiskeyword;

public class ThisExample5 
{
	int variable=5;
	int age=10;
	
	void method(int variable)
	{
		System.out.println("Value of variable = "+variable);//45
		System.out.println("GV Value of variable = "+this.variable);//5
		this.variable=variable;
		System.out.println("Value of variable = "+variable);//45
		System.out.println("GV Value of variable = "+this.variable);//45
	}
	
	void method()
	{
		int variable=40;
		System.out.println("Value of variable = "+variable);//40
	}

	public static void main(String[] args) 
	{
		ThisExample5 obj=new ThisExample5();
		obj.method(45);
		obj.method();
		System.out.println("obj GV Value of variable = "+obj.variable);
		
		ThisExample5 obj2=new ThisExample5();
		System.out.println("GV Value of variable = "+obj2.variable);		//5

	}

}
