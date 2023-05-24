package day17.thiskeyword;

public class ThisExample1 
{
	int x=25,y=55;
	void calling(int x)
	{
		System.out.println("Local variable x = "+x); //45
		System.out.println("Non Static global y ="+y);//55
		System.out.println("Non Static global x ="+this.x);//25
	}

	public static void main(String[] args) 
	{
		ThisExample1 e=new ThisExample1();
		e.calling(45);
		System.out.println("x = "+e.x);//25
		System.out.println("y = "+e.y);//55		
	}

}
