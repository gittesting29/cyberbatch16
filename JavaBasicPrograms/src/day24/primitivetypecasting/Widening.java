package day24.primitivetypecasting;

public class Widening 
{
public static void main(String []args)
{
	byte b=5;
	short s=b;
	int i=b;
	long l=b;
	float f=b;
	double d=b;
	System.out.println("Widening TYpe Casting::");
	System.out.println("byte to short : "+s);
	System.out.println("byte to int : "+i);
	System.out.println("byte to long : "+l);
	System.out.println("byte to float : "+f+"f");
	System.out.println("byte to double : "+d+"d");
}
}
