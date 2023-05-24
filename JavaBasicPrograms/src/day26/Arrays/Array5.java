package day26.Arrays;
// creating method which returns an array	
class TestArray2
{
 	static int []getArray()
 	{
 		//int num[]= {11,12,13,14,15};
 		//return num;
 		return new int[] {11,12,13,14,1};
 	}
}
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=TestArray2.getArray();
		for(int i:arr)
			System.out.println(i);
	}

}
