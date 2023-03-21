package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@FunctionalInterface
interface MapSorting{
	
    Map<String, Integer> sortingMap(Map<String, Integer> map);	
	
}

public class Demo {
	
	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<>();
	
	map.put("A", 7);
	map.put("C", 28);
	map.put("O", 21);
	map.put("G", 17);
	map.put("L", 2);
	map.put("W", 8);
	map.put("Q", 26);
	map.put("U", 5);
	map.put("I", 31);
	map.put("X", 29);
	System.out.println(map);
	System.out.println("\n\n\n=======================================\n\n\n");
	
	
//	ascending order 
	MapSorting sort = m ->{
	Map<String, Integer> ans = new LinkedHashMap<>();	

	ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
	
	Collections.sort(list , (o1,o2) -> o1.getValue().compareTo(o2.getValue()));
	
	list.forEach( e -> {
		
	ans.put(e.getKey(), e.getValue());	
		
	});
	
	
		
	  return ans;
	};
	
	
	
//	descending order
	MapSorting sort1 = m ->{
		Map<String, Integer> ans = new LinkedHashMap<>();	

		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
		
		Collections.sort(list , (o1,o2) -> o2.getValue().compareTo(o1.getValue()));
		
		list.forEach( e -> {
			
		ans.put(e.getKey(), e.getValue());	
			
		});
		
		
			
		  return ans;
		};	
	
	
	System.out.println("MAP SORTING IN ASCENDING ORDER OF TIER VALUE");	
   map = sort.sortingMap(map);	
   System.out.println(map);
   System.out.println("\n\n\n=======================================\n\n\n");
   System.out.println("MAP SORTING IN DESCENDING ORDER OF TIER VALUE");
   map = sort1.sortingMap(map);
   System.out.println(map);
   
	
		
	}

}
