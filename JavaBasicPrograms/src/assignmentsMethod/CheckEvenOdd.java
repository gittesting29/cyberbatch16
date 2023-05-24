package assignmentsMethod;

public class CheckEvenOdd {

	static int getCheck(int num)
	{
		if(num%2==0)
			System.out.println("Number "+num+" is even number.");
		else
			System.out.println("Number "+num+" is odd number.");
		return(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=CheckEvenOdd.getCheck((70));
		
		
	}

}
