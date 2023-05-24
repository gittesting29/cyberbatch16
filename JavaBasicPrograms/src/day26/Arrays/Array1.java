package day26.Arrays; 

public class Array1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Array length...."+a.length+"\n");
		for(int i:a)
		{System.out.println(i);}
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println();
		for(int i:a)
			System.out.println(i);
		char[] c=new char[5];
		c[0]='a';
		c[1]='d';
		c[2]='v';
		c[3]='i';
		c[4]='k';
		System.out.println();

		for(char i:c)
			System.out.print(i);
		char []c1= {'r','a','t','h','o','d'};
		System.out.println();
		for(char i:c1)
			System.out.print(i);
	}

}
