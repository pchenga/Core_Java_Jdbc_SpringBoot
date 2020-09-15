package com.pc.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapDemo {

	public static void main(String[] args) {
		
	   //Map -> 
		
	   //HashMap
	   //LinkedHashMap
	   //TreeMap
		
		//Keys are unique (Set)
		//values are duplicate(List)
		//only null key is allowed 
		Map<String,Integer> map = new HashMap<>();
		map.put("one", 1); //entry = (k,v) Map.Entry<"One",1>
		map.put("two", 2); 
		map.put("two", 22);
		map.put("three", 22);
		map.put(null,00);
		map.put(null,99);
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		System.out.println(map.containsKey("two"));
		System.out.println(map.containsValue(2));
		
		//Access a map value
		Integer v1 = map.get("one");
		System.out.println(v1);
		
		//Access the values
		Collection<Integer> nums =  map.values();
		nums.forEach(e -> System.out.println(e));
		
		//Get the keys from map
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		
		for(String key :keys) {
			Integer value = map.get(key);
			System.out.println(key + "\t" + value);
		}
		
		//entrySet Key,Value
		Set<Map.Entry<String,Integer>>  entries = map.entrySet();
		
		for(Map.Entry<String,Integer> e: entries) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key +"\t" + value);
			
		}
		
		System.out.println("Iterator");
		Iterator<Integer> valueItr = nums.iterator();
		while(valueItr.hasNext()) {
			System.out.println(valueItr.next());
		}
		
		Iterator<String> keysItr = keys.iterator();
		while(keysItr.hasNext()) {
			System.out.println(keysItr.next());
		}
		
		//Entry<String,Integer>
		Iterator<Map.Entry<String,Integer>> entriesItr=entries.iterator();
		
		while(entriesItr.hasNext()) {
			
			Map.Entry<String,Integer> e = entriesItr.next();
			String key = e.getKey();
			Integer value = e.getValue();
			
			System.out.println(key + "\t" + value);
			
		}
		
		
	
		
		
		
		
		

	}

}
