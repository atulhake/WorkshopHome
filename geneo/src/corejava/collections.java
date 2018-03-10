package corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class collections {

//	public static void main(String[] args) 
//	{
//		 List s = new ArrayList();
//		 s.add("2");
//		 s.add("atul");
//		 s.add("2.94");
//		 s.add(true);
//		 s.add("2");
//		 
//		 System.out.println(s);
//		 
//	}

	
//	public static void main(String[] args) 
//	{
//		 List s = new LinkedList();
//		 s.add("2");
//		 s.add("atul");
//		 s.add("2.94");
//		 s.add(true);
//		 s.add("2");
//		 s.add("atul balwant hake");
//		 System.out.println(s);
//		 
//	}
	
	
//	public static void main(String[] args) 
//	{
//		 List s = new Vector<>();
//		 s.add("atul");
//		 s.add("2.94");
//		 s.add(true);
//		 s.add("2");
//		 s.add("atul balwant hake");
//		 System.out.println(s);
//		 
//	}
	
	
//	public static void main(String[] args) 
//	{
//		 Set<Integer> s = new TreeSet<Integer>();
//		 s.add(4565);
//		 s.add(2);
//		 s.add(45);
//		 s.add(56);
//		
//		 System.out.println(s);
//		 
//	}
	
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> s = new Hashtable<Integer,String>();
		s.put(60, 	"atul");
		s.put(45, "balawant");
		s.put(100, "hake");
		
		Set keyset = s.keySet();

		System.out.println(keyset);
	  for(Map.Entry m : s.entrySet())
	  {
		  System.out.println(m.getKey()+"  "+m.getValue());
	  }
		
		 System.out.println(s);
	}
}
