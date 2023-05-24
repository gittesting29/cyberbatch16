package day24.primitivetypecasting;
class Sample1
{
	double test1()	//explicit narrowing 
	{
		System.out.println("Running test1.. ");
		return 4;
	}
}
public class PrimitiveCasting6 
{
	public static void main(String[] args) 
	{
		Sample1 s=new Sample1();
		int res=(int)s.test1();
		System.out.println("Return Vale : "+res);
	}
}