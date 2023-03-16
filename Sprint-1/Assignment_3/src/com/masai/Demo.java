package com.masai;

import java.time.LocalDate;


//FUNCTIONAL INTERFACE
@FunctionalInterface
interface Day{
	
	LocalDate toDay();
	
}
//NORMAL INTERFACE
interface Greeting{
	
	String morning();
	String night();

}





public class Demo {

	
	public static void main(String[] args) {
	
	
//	LAMBDA EXPRESSION
	Day d = () -> LocalDate.now();
	  System.out.println(d.toDay()); 
	  
	Day d2 = new Day() {
		
		@Override
		public LocalDate toDay() {
			
			return LocalDate.now();
		}
	};  
		
	System.out.println(d2.toDay());
	
	
	Greeting g1 = new Greeting() {
		
		@Override
		public String night() {
			return "Good Night";
		}
		
		@Override
		public String morning() {
			// TODO Auto-generated method stub
			return "Good Morning";
		}
	};
	
	System.out.println(g1.night());
	System.out.println(g1.morning());
	
		
		
		
		
		
		
	}
	

}


