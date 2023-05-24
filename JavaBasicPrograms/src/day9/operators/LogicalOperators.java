package day9.operators;

/* LHS and RHS result should be in boolean format
 * :::::::::::::&& operator(Logical AND)::::::::::::::
 * if both are true then result will be true otherwise false.
 *     T && T= T
 *     T && F= F
 *     F && T= F
 *     F && F= F
 *     
 * ::::::::::|| opeartor(Logical OR):::::::::::::::
 * if any one is true then true otherwise false
 * 	   T || T= T
 *	   T && F= T
 *     F && T= T
 *     F && F= F
 *     
 * :::::::::: ! operator(Logical NOT)::::::::::::::
 *     !T = F
 *     !F = T
 * 
 * */
public class LogicalOperators 
{
	public static void main(String[] args)
	{
		boolean bool1= true, bool2=false;
		//Logical AND
		System.out.println("bool1 && bool2="+(bool1 && bool2));
		
		//Logical OR
		System.out.println("bool1 || bool2="+(bool1 || bool2));
		
		//Logical NOT
		System.out.println("!(bool1 && bool2)="+!(bool1 && bool2));
				
				
		
	}
}
