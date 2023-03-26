package com.masai;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Class {
	
	public static void main(String[] args) throws IOException {
		
	
	ArrayList<Student> list = new ArrayList<>();	
	
	list.add( new Student(1, "Omkar", 23, "Banglore"));
	list.add( new Student(2, "Shivay", 21, "Banglore"));
	list.add( new Student(3, "Deva", 26, "Banglore"));
	list.add( new Student(4, "Arjun", 28, "Banglore"));
	list.add( new Student(5, "Karan", 19, "Banglore"));
	
	
//	list.forEach(e -> System.out.println(e));
	
	FileOutputStream fos = new FileOutputStream("StudentData");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(list);
	
	
	fos.close();
	oos.close();
	
	System.out.println("Serialization completed");
	
	
		
		
	}

}
