package day38.proprtyfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestDataTesting {

	public static void main(String[] args) throws IOException  {
//Firsts find location where property file is stored.
//create instance of FileInputStream class and in its constructor pass the location of file
//create instance of Properties class
//with instance call load() and pass FIOS reference as parameters.
//two types of paths
//1. Absolute path:from first to end..directory to this
//2. relative path: ./and file name
 
		
			FileInputStream fs=new FileInputStream("E:\\Testing\\AutomationnTesting\\Workspace\\JavaBasicPrograms\\ProprtyFiles\\TestData.properties");
			Properties prop=new Properties();
			prop.load(fs);
			System.out.println(prop.getProperty("key1"));
			System.out.println(prop.getProperty("key2"));
			
	}

}
