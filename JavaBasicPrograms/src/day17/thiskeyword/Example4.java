package day17.thiskeyword;

public class Example4 
{
	int age;
	void call() 
	{
		System.out.println("I am call()");//will print this statement. program counter go to main() again
	}
	void m(int age)
	{
		System.out.println("Local variable age = "+age);//35
		System.out.println("Global variable age = "+this.age);//0
		this.call();//program counter go to call()
		System.out.println("this keyword value is = "+this);//will print value same as object
	}

	public static void main(String[] args)
	{
		Example4 e=new Example4();
		System.out.println("object value is = "+e);//object value
		e.call();//program counter go to call method
		e.m(35);//program counter go to call method
	}
}
