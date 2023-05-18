package thread_implementation;

public class Main {
	public static void main(String[] args) {
		
		//implementation of Tread using Runnable interface.
//		MyThread1 t1 =new MyThread1();
		
//		start()- java.lang.Thread
		
//		Thread thread = new Thread(t1);
//		thread.start();
		
		//Implementation of Tread using Tread class
//		MyThread2 t2 = new MyThread2();
//		t2.start();
		
		
		// create new thread using anonymous class
//		Runnable aT1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				System.out.println("Thread is running in anonmous calss ..........");
//				
//			}
//		};
//		Thread t3 = new Thread(aT1);
//		t3.start();
		
		//create new thread using lambda expression.
		
				Runnable r=()->{
					
					System.out.println("Thread is running using lambda expressions...........");
					
				};
				
				Thread t4 = new Thread(r);
				t4.start();
		
	}

}
