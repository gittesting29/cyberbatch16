package day13.methodexamples;

public class SimpleInterest 
{
	static double getROI() {
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	public static void main(String[] args) 
	{
		double roi1=getROI();
		System.out.println(" \n No parameters------>Rate of interest : "+roi1);
		System.out.println("************************************");
		
		System.out.println("call Directly from println()----->Interest to be paid is: "+getROI());
		System.out.println("************************************");
		
		double roi2=getROI(40000,36,7.5f);
		System.out.println(" \n With parameters------>Rate of interest : "+roi2);
		
		double finalAmoutToBePaid=55000+roi2;
		System.out.println("\n\n Total Amount to be paid incluiding interest : "+finalAmoutToBePaid);
	}

}
