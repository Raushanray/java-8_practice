package lambda.expression.method_reference;

public class MethodRefWithStaticMet {
	public static void threadStatus() {
		System.out.println("thread is running..........");
	}
	public static void main(String[] args) {
		Thread t1 =new Thread(MethodRefWithStaticMet::threadStatus);
			t1.start();
	}

}
