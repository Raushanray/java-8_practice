package thread_implementation;

public class Main {
	public static void main(String[] args) {
		
		//implementation of Tread using Runnable interface.
		MyThread1 t1 =new MyThread1();
		
//		start()- java.lang.Thread
		
		Thread thread = new Thread(t1);
		thread.start();
		
		
		
	}

}
