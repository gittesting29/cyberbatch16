package day22.interfaceImplementsConcepts;

interface Bank
{
	float rateOfInterest();      //by default public and abstract
}
class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 9.7f;
	}
}
public class Interface2 {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println("SBI rate of interest : "+s.rateOfInterest());
		PNB p=new PNB();
		System.out.println("PNB rate of interest : "+p.rateOfInterest());
		Bank b=new SBI();
		b.rateOfInterest();
	}

}
