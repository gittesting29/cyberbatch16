package day17.thiskeyword;
/*this keyword--->it is an instance of a current class.
 * 				  it is used to access non static members
 * 				  can be used only in non static methods and constructors.
 * 				 mainly used to differentiate between non static and local variables when they have same name
 * */
class Student1
{
	int rollNo;
	float fee;
	Student1(int rollNo, float fee)
	{
		System.out.println("Local rollNo :"+rollNo);
		System.out.println("Local fee :"+fee);
		System.out.println("Initial global value of rollNo :"+this.rollNo);
		System.out.println("Initial global value of fee :"+this.fee);
		
		this.rollNo=rollNo;
		this.fee=fee;
		System.out.println("Updated global value of rollNo :"+this.rollNo);
		System.out.println("Updated global value of fee :"+this.fee);
	}
	void display()
	{
		System.out.println("Roll Number = "+rollNo+"\t Fee = "+fee);
	}
}
public class Example1 
{

	public static void main(String[] args) 
	{
		Student1 s1=new Student1(1010,28000);
		s1.display();
		
		Student1 s2=new Student1(101,15000);
		s2.display();
	}

}
