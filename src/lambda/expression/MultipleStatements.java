package lambda.expression;

public class MultipleStatements {
	public static void main(String[] args) {
		HelloWorld helloWorld = (message) -> {
			String str1 = "Hello ";
			String str2 = str1 + message;
			return str2;
			
		};
		System.out.println(helloWorld.sayHello("Raushan"));
	}

}
