package com.masai;

public interface Interface1 {
	
	void method1();
	
	static void method2() {
	
		System.out.println("Static method of interface");
		
	}


}


abstract class Demo {
	
  
	
}

class Demo1 extends Demo{
	
	
}

class Demo2 extends Demo{
	
	
	public static void main(String[] args) {
	
	
		Demo d = new Demo1();
	}
	
}