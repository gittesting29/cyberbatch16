package day22.abstraction;
abstract class Shape
{
	abstract void draw();
}
// in real implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape
{
	protected void draw()
	{
		System.out.println("Drawing rectangle..");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle.");
	}	
}
//in real scenario, method is called by programmer or user

class abstractClass3 {

	public static void main(String[] args) 
	{
		//Shape s=new Shape();  error as Shape is abstract class
		Shape s=new Circle();
		s.draw();//this abstract method call implemented in Circle class
		Shape s1=new Rectangle();
		s1.draw();//this abstract method call implemented in Rectangle class
	}

}
