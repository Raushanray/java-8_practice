package lambda.expression.method_reference;

@FunctionalInterface
interface DisplayInterface{
	void display();
}

public class MethodRefWithInstanceMet {

	public void sayHello() {
		System.out.println("hello Raushan");
	}
	public static void main(String[] args) {
		MethodRefWithInstanceMet obj = new MethodRefWithInstanceMet();
		DisplayInterface displayInterface = obj::sayHello;
		displayInterface.display();
		
		
	}
	
}
