package com.masai;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class run1 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("inside class which is implemented runnable interface");
		
	}
	
}


public class Demo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
    Runnable run2 = () -> System.out.println("inside a variable of runnable interface...");		
	
	run1 r = new run1();	
		
    Thread t2 = new Thread(run2);
	Thread t1 = new Thread(r);
	
	t1.start();
	t2.start();
	
	
	Callable<String> c1 = new Callable<String>() {

		@Override
		public String call() throws Exception {
			
			return "inside call method of callable interface";
		}
		
		
	};
	
	ExecutorService ser = Executors.newFixedThreadPool(4);
	
	Future<String> ans = ser.submit(c1);
	
	System.out.println(ans.get());
	
	
	
	
	
	
	
		
		
	}

}
