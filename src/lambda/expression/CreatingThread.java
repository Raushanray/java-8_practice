package lambda.expression;

public class CreatingThread {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			//thread without lambda expression 
			@Override
			public void run() {
				System.out.println("Thread is running............");
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		//thread with lambda expression
		Runnable r2 = ()-> {System.out.println("thread is running with help of lembda expressions..........");};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
