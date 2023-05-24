package day24.primitivetypecasting;
class Sample
{
	void test1(double d)	//implicit widening
	{
		System.out.println("d value : "+d);
	}
}

public class PrimitiveCasting5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts...");
		Sample s=new Sample();
		s.test1(45); //passed integer value
		System.out.println("Program ends...");
	}

}
