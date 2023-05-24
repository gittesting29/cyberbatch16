package day24.primitivetypecasting;

public class PrimitiveCasting2 {

	public static void main(String[] args) 
	{
		int salary=30000;
		System.out.println("****** Explicit Widening**********");
		double dsalary=(double)salary;
		float fsalary=(float)salary;
		System.out.println("Int Salary : "+salary+"\tDouble salary : "+dsalary+"\tFloat Salary : "+fsalary);
		
		double dsal=300000.00d;
		System.out.println("****** Implicit Widening**********");
		int isal=(int)dsal;
		float fsal=(float)dsal;
		System.out.println("Double Salary : "+dsal+"\tInt salary : "+isal+"\tFloat Salary : "+fsal);
		
		//implicit narrowing not possible
		//int salary2=dsal;
	}

}
