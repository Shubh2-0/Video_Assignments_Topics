package com.masai;

public class main {

	public static void main(String[] args) {
		
		
	Student st1 = new Student(1, "Harsh", 23, "Banglore", 340);
	Student st2 = new Student(2, "pankaj", 25, "Jaipur", 540);
	Student st3 = new Student(6, "pankaj", 25, "Indore", 50);
	
	
	System.out.println(st1.equals(st2));
	System.out.println(st1.hashCode() == st2.hashCode());
	
	System.out.println(st2.equals(st3));
	
//	System.out.println(st2.hashCode() == st3.hashCode());
//	System.out.println(st3.hashCode());
//	System.out.println(st2.hashCode());
		
		
	}
	
}
