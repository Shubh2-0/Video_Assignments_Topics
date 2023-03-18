package com.masai;

import java.util.Objects;

public class Student {
    
	int id;
	String name;
	int age;
	String city;
	
	public Student(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return   this.id == other.id;
				
	}

	
	
	
	
	
}
