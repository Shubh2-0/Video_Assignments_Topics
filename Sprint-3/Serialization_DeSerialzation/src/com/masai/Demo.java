package com.masai;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("StudentData");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
	
		
		ArrayList<Student> data = (ArrayList<Student>) ois.readObject();
		
		
		  fis.close();
		  ois.close();
	
	
	
	
	
	data.forEach(e -> System.out.println(e));
	
	
	
	
		
		
	}

}
