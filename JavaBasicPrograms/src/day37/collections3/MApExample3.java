package day37.collections3;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class MApExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put("key1","admin");
		m1.put("key2","manager");// for string values up casting 
		m1.put("Key2", 123); //first integer value wrapped in integer class and then up casting done 
		m1.put("key3","admin123");
		m1.put("key2","admin");//recent value will be taken for duplicate key
		m1.put(null, null);
		System.out.println("Map size : "+m1.size());
		System.out.println("Map elements : "+m1);
		System.out.println("To get keys : " +m1.keySet());
		System.out.println("Values in map : "+m1.values());
		System.out.println("To get perticular key value : "+m1.get("key2"));

		Map<String, String> mp=new HashMap<String, String>();
		mp.put("Key1","null");
		mp.put("key2","manager");// for string values up casting 
		mp.put("Key2", "123"); //first integer value wrapped in integer class and then up casting done 
		mp.put("key3","admin123");
		for(Entry<String, String> pair:mp.entrySet())
		{
			System.out.print(pair.getKey()+" : "+pair.getValue()+"\n ");
		}
	}

}
