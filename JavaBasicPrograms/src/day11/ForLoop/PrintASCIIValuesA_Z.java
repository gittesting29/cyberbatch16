package day11.ForLoop;

public class PrintASCIIValuesA_Z {

	public static void main(String[] args)
	{
		for(char c='A'; c<='Z'; c++)
		{
			int ansi_value=c;
			System.out.println("ASCII value of "+c+" = "+ansi_value);
		}
	}

}
