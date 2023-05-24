package day11.ifelsesassignments;

public class LargestOf3 {

	public static void main(String[] args)
	{
		int a=45,b=12,c=94,largest;
		/*if(a>b)
		{
			if(a>c)
				largest=a;
			else
				largest=c;
		}
		else
		{
			if(b>c)
				largest=b;				
			else
				largest=c;
		}*/
		if(a>b && a>c)
		{
			largest=a;
			System.out.println(largest+" is the lagest.");
		}
		else if(b>a && b>c)
		{
			largest=b;
			System.out.println(largest+" is the lagest.");
		}
		else
			System.out.println(c+" is the lagest.");
			
		
	}

}
