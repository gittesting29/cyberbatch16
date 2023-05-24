package day36.collections2;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher, int quantity)
	{	
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
    }
}
public class ArrayListExample5 
{
	public static void main(String[] args) 
	{
		List<Book> list= new ArrayList<Book>(); //generic
		Book b1=new Book(1,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(2,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
		Book b3=new Book(3,"abc","pqr","dasd",78);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(4,"q","r","f",23));
		
		for(Book b: list)
		{
			System.out.println(b.id+",  "+b.name+",  "+b.author+",  "+b.publisher+",  "+b.quantity);
		}
		
		

	}
}
