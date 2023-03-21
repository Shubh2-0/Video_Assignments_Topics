package com.masai;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
	
	public static void method1(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		
	 Predicate<Integer> p1 = e -> e%2==0;
	 
	 System.out.println(p1.test(3));
	 System.out.println(p1.test(4));
	 
	 Consumer<String> c1 = Demo::method1;

	 c1.accept("Shubham");
	 
	 
	 Supplier<Integer> s1 = () ->  (int)Math.floor(Math.random()*60);
	 
	 System.out.println(s1.get());
	 
	 
	 Function<String, Integer> f1 = Integer::parseInt;
	 
	 System.out.println(f1.apply("34")+10);
	 
	 
		
	}

}
