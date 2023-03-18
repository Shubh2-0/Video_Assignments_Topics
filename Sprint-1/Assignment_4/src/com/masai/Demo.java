package com.masai;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
	
//	HashSet<Integer> set = new HashSet<>();
//	set.add(1);
//	set.add(3);
//	set.add(64);
//	set.add(72);
//	set.add(81);
//	set.add(92);
//	set.add(4);
//	set.add(6);
//	set.add(7);
//	set.add(8);
//	set.add(9);
//	
//	System.out.println(set);
//	
//	set.add(7);
//	set.add(8);
//	
//	System.out.println(set);
//	
//	HashSet<Student> set2 = new HashSet<>();
//	
//	set2.add( new Student(1, "abc", 21, "jaipur"));
//	set2.add( new Student(2, "pqr", 24, "jaipur"));
//	set2.add( new Student(3, "ghu", 22, "jaipur"));
//	set2.add( new Student(4, "lio", 26, "jaipur"));
//	set2.add( new Student(5, "avg", 28, "jaipur"));
//	
//	set2.add( new Student(5, "avg", 28, "jaipur"));
//	
//	
//	set2.forEach(e -> System.out.println(e));
//	
//	
//	
//	
//	HashMap<Integer, String> map = new HashMap<>();
//	
//	map.put(1, "abc");
//	map.put(2, "pqr");
//	map.put(3, "rst");
//	map.put(4, "crt");
//	map.put(5, "iop");
//	map.put(6, "art");
//	System.out.println(map);
//	
//	map.put(6, "ban");
//	map.put(9, "abc");
//	System.out.println(map);
	
	HashMap<Student, Integer> map2 = new HashMap<>();
	map2.put(new Student(5, "abc", 21, "jaipur"), 359);
	map2.put(new Student(2, "pqr", 25, "jaipur"), 219);
	map2.put(new Student(6, "stu", 23, "jaipur"), 459);
	map2.put(new Student(9, "ban", 22, "jaipur"), 289);
	
	
	
	map2.forEach( (e,e2) -> System.out.println("Key : "+e+"    "+"Value : "+e2));
	
	System.out.println("====================================");
	map2.put(new Student(9, "ban", 2, "jaipur"), 509);
	
	map2.forEach( (e,e2) -> System.out.println("Key : "+e+"    "+"Value : "+e2));
	
	
	
	
		
	}

}
