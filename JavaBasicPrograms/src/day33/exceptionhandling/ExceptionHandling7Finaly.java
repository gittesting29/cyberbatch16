package day33.exceptionhandling;

public class ExceptionHandling7Finaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts from here");
		try {
			// below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// catch won't be executed
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled...");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled.."+e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
