package day19.contsructors;
/*Constructor is used to initialize non static members of the class.
 * in this program we can see how 'salary' variable value is getting initialized by constructor.*/
public class Example4Iitialization 
{
	int age;
	double salary;
	Example4Iitialization()
	{
		System.out.println("User defined  zero parameters.");
		age =25;
		salary=90000.00;
		System.out.println("Constructor ends..........");
		System.out.println("*****************************************\n");

	}
	public static void main(String[] args) 
	{
		Example4Iitialization ref1= new Example4Iitialization();
		System.out.println(ref1.age);
		System.out.println(ref1.salary);
		
		ref1.salary=120000.00;
		System.out.println("Updated salary="+ref1.salary);
		System.out.println("*****************************************\n");

		Example4Iitialization ref2= new Example4Iitialization();
		System.out.println("Salary="+ref2.salary);
	}
}
