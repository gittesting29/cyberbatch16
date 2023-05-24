package day14.Memory;
/*this keyword------> it is an instance of a current class.
					   it is used to differentiate non-static global variables 
					   and local variables when they have same name.
					   this keyword should use only inside non-static method/ constructor.
*/
public class NonStaticMemory 
{
	int age=25;
	void display(int age)
	{
		System.out.println("age : "+age);
		NonStaticMemory nsm=new NonStaticMemory();
		System.out.println("Non static global variable age : "+nsm.age);
		System.out.println("Non static global variable age : "+this.age);
	}
	public static void main(String[] args) 
	{
		NonStaticMemory nsm2 = new NonStaticMemory();
		nsm2.display(50);
	}

}
