package com.masai;

public interface Interface1 {
	
	void method1();
	
	static void method2() {
	
		System.out.println("Static method of interface");
		
	}


}


abstract class Demo implements Interface1{
	
   public void method1() {
		
	   System.out.println("method");
	   
	}
   
   void method4() {
	   
   }
	
	
}

class Demo1 extends Demo{
	
	
}

class Demo2 extends Demo{
	
	
	public static void main(String[] args) {
	
	
		Interface1 it = new Demo1();
		Demo hg = new Demo1();
		
		hg.method1();
		it.method1();
		
	}
	
}