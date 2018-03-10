package corejava;

import java.util.HashMap;
import java.util.Map;

public class A {

	
	
	
		int id;
		String name, author, publisher;
		int quantity;

		public A(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		}
		

	public static void main(String[] args) {
		Map<Integer,A> s = new HashMap<Integer,A>();
			A b1 = new A(1,"atul","mad","asj",12);
			A b2 = new A(2,"ramesh","mad","asj",13);
			A b3 = new A(3,"satish","mad","asj",14);
	
	s.put(1, b1);
	s.put(2, b2);
	s.put(3, b3);
	for(Map.Entry<Integer, A>entry:s.entrySet())
	{
		int key = entry.getKey();
		A b= entry.getValue();
		System.out.println(key+" :- Details :");
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	
	
	
	
	
	
	
	
	}
}
