package com.masai;


class run1 implements Runnable{

	@Override
	public void run() {
		
	for(int i=1;i<11;i++)
		System.out.print(i+" ");
		
	}
	
}



public class Demo {
	
	
	public static void main(String[] args) throws InterruptedException {
	  
	Runnable r2 = () -> {
	
		for(int i=10;i>=1;i--)
			System.out.print(i+" ");
		
		
	};
		
		
		run1 r1 = new run1();
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t1.join();
		t2.start();
		
		
		
		
		
	}

}
