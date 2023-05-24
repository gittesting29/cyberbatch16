package day36.collections2;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		System.out.println("Initial list : "+al1);
		System.out.println("List of elements status : "+al1.isEmpty());
		al1.add("678");
		al1.add("abc");
		al1.add("pqr");
		al1.add("xyz");
		System.out.println("ArrayList elements : "+al1);
		System.out.println("After adding elements status : "+al1.isEmpty());
		
		ArrayList al2=new ArrayList();
		System.out.println("Initial list : "+al2);
		System.out.println("List of elements status : "+al2.isEmpty());
		al2.add("123");
		al2.add("savita");
		al2.add("poonam");
		al2.add("swapna");
		System.out.println("ArrayList elements : "+al2);
		System.out.println("After adding elements status : "+al2.isEmpty());
	
		al1.addAll(al2);
		System.out.println("After adding all elements of list2 in list 1 : \n"+al1);
		System.out.println("Sorting after adding");
		Collections.sort(al1);
		System.out.println(al1);
	}

}
