package day38.proprtyfiles;
import java.io.*;
import java.util.*;
public class TestData2Testing {

	public static void main(String[] args) throws IOException 
	{
		String loc="E:\\Testing\\AutomationnTesting\\Workspace\\JavaBasicPrograms\\ProprtyFiles\\TestData2.properties";
		FileInputStream fs=new FileInputStream(loc);
		Properties p=new Properties();
		p.load(fs);
		
		System.out.println(p.getProperty("username"));
		
		int sal=Integer.parseInt(p.getProperty("salary"));
		System.out.println(sal);
	}

}
