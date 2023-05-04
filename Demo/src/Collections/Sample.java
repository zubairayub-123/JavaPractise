package Collections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		list.add(45);
		list.add(7);
		list.add(18);
		list.add(33);
		list.add(99);
		
		for(int e: list) {
			System.out.println(e);
		}
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println("--------------------------------------------------------");
		
		//converting array to arraylist
		
		String arr[] = {"Rohit","Virat","Dhoni"};
		System.out.println("data : " + Arrays.toString(arr));
		
		System.out.println("--------------------------------------------------------");
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Realme");
		h.add("Redmi");
		h.add("Samsung");
		h.add("Oneplus");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
				//or
		
		System.out.println("data: " +h);
		
		h.remove("Redmi");
		System.out.println(" After removing data: ");
		System.out.println("data: " +h);
		
		System.out.println("--------------------------------------------------------");
		
		Map<String, Integer> w = new HashMap<>();
		
		w.put("Rohit", 45);
		w.put("Kohli", 18);
		w.put("Dhoni", 7);
		w.put("Surya", 33);
		
		System.out.println(w);
		System.out.println(w.get("Dhoni"));
		System.out.println(w.keySet());
		
		for(String s:w.keySet()) {
			System.out.println(s + " --> " + w.get(s));
		}
		
		for(Integer n:w.values()) {
			System.out.println(n + " --> " );
		}
		
	}

}
