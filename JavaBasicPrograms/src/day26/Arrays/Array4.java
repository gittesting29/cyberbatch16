package day26.Arrays;
//array as method parameter
class TestArray
{
	static void minimum(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Minimum number in array : "+min);
	}
	void maximum(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Maximum number in array : "+max);
	}
}
public class Array4 {

	public static void main(String[] args) {
		int a[]= {33,13,4,50,15,1};
		TestArray.minimum(a);
		TestArray t=new TestArray();
		t.maximum(a);
		
	}

}
