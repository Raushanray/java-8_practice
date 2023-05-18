package thread_implementation;

public class MyThread2 extends Thread{
	
	public void run() {
		
		//thread task
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
