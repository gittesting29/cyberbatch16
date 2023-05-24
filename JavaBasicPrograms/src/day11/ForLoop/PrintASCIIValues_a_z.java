package day11.ForLoop;

public class PrintASCIIValues_a_z 
{
public static void main(String[] args)
{
	for(char c='a'; c<='z'; c++)
	{
		int ansi_value=c;
		System.out.println("ASCII value of "+c+" = "+ansi_value);
	}
}

}
