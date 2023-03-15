package com.masai;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//MARKER INTERFACE - NO ABSTRACT METHODS 
interface Marker{
	
	static void methodMarker() {
		System.out.println("Marker Interface Method");
	}
	
}

//NORMAL INTERFACE
interface Normal{
	
	void method1();
	void method2();
	
}

//FUNCTIONAL INTERFACE

@FunctionalInterface
interface FunctionalIntr{
	
		void methodDemo();

		static void staticDemo() {
			System.out.println("Static method of functional interface");
		}
		
		
		static void staticDemo2() {
			System.out.println("Static method 2 of functional interface");
		}
	
		static void staticDemo3() {
			System.out.println("Static method 3 of functional interface");
		}
		
		String toString();
		
}


public class Demo {
	
	public static void methodMain() {
		System.out.println("static-Method references");
	}
	
	public void methodMain2() {
		System.out.println("Non-static Method references");
	}
	
	public static void main(String[] args) {
		
	FunctionalIntr i1 = () ->{
		
		System.out.println("Abstract method of functionalIntr interface");
	};
		
	Demo d1 = new Demo();
	
	FunctionalIntr i3 = d1::methodMain2;
	
	i3.methodDemo();
	
	FunctionalIntr i2 = Demo::methodMain;
	
	i2.methodDemo();
	
		
	i1.methodDemo();
	
    Predicate<Integer> check = e -> e%2==0;
    
     System.out.println( check.test(3));  
     System.out.println( check.test(4));  
     
     Consumer<Integer> print = e -> System.out.println(e);
     
     print.accept(4);
     
     
     Supplier<Integer> number = () ->  5*10;
     System.out.println(number.get());     
    
  
     Function<String, Integer> f = Integer::parseInt;
     
      System.out.println(f.apply("356") + 100);
     

	
		
	}
	
	

}
