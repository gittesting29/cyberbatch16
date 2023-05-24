package day11.forassigments;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int original = 123456789;   //assume > 0
	    int num = 0;
	    for(int temp = original;temp > 0;temp/=10)
	    {
	        num = num * 10 + temp % 10;
	    }
	    System.out.println(original + " reversed is " + num);
	}

}
