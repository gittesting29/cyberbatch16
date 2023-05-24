package day19.contsructors;

public class Example3_execution 
{
	int roll=90;
	double salary=890000;
	Example3_execution()
	{
		
	}
	Example3_execution(int r, double sal)
	{
		roll=r;
		salary=sal;
	}
	void display()
	{
		System.out.println(roll+"     "+salary);		
	}
	
	
	public static void main(String[] args)
	{
		Example3_execution cons= new Example3_execution();
		cons.display();
		Example3_execution cons2=new Example3_execution(23,45888.00);
		cons2.display();
	}

}
 