package day12.switchcase;

public class VowelCheck {

	public static void main(String[] args) 
	{
		char ch='f';
		switch(ch)
		{
		case 'e':
			System.out.println("Value matched 'e' is vowel");
			break;
		case 'a':
			System.out.println("Value matched 'a' is vowel");
			break;
		case 'i':
			System.out.println("Value matched 'i' is vowel");
			break;
		case 'o':
			System.out.println("Value matched 'o' is vowel");
			break;
		case 'u':
			System.out.println("Value matched 'u' is vowel");
			break;
		default:
			System.out.println(ch + " is consonant.");
			break;
		}
		
	}

}
