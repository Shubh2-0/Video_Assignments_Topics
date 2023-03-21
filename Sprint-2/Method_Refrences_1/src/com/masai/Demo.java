package com.masai;

import java.time.LocalDate;

@FunctionalInterface
interface InterDemo{
	void Hello();
}
@FunctionalInterface
interface InterDemo2{
	
	void greeting(String name);
	
}

@FunctionalInterface
interface InterDemo3{
	
	Demo giveDemo();
	
}


public class Demo {

	static LocalDate date = LocalDate.now();
	
	
	public static LocalDate getDate() {
		return date;
	}

	public static void setDate(LocalDate date) {
		Demo.date = date;
	}

	public void greet(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
	
		
	InterDemo3 i3 = Demo::new;
	
	 Demo d2 =   i3.giveDemo();
	 
	 
	 
	 
	   System.out.println(d2.getDate()); 
    
	   System.out.println();
	 
	 
	
		
	Demo d = new Demo();
	InterDemo2 i2 = d::greet;
	InterDemo i1 = Demo::sayHello;
	
	
	i1.Hello();
	i2.greeting("Masai School");
		
		
	}
}
