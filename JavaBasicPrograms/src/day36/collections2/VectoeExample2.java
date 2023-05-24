package day36.collections2;
import java.util.Vector;

public class VectoeExample2 
{
	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>();
		vec.add("cyber");
		vec.add("sucesses");
		vec.add("pune");
		vec.addElement("training");
		System.out.println("Vector size : "+vec.capacity());
		System.out.println("Vector elements uing forEach : "+vec);
		vec.add("pune");
		vec.forEach(a -> {System.out.print(a+" "); });
		vec.addElement("institute");
		System.out.println("\nVector elements uing object : "+vec);
		System.out.println("first Vector element : "+vec.firstElement());
		System.out.println("last Vector element : "+vec.lastElement());
		vec.add("pune");
		System.out.println("first Vector element : "+vec.lastIndexOf("pune") );

		
	}

}
