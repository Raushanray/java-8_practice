package thread_implementation;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		
		//thread task
		for (int i = 0; i <= 20; i++) {
			System.out.println("print value of I :" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
