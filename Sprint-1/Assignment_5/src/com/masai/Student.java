package com.masai;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	int age;
	String city;
	int marks;
	
	public Student(int id, String name, int age, String city, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, marks, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id && marks == other.marks
				&& Objects.equals(name, other.name);
	}
	
	
	

}
