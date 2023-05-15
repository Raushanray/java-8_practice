package lambda.expression;


@FunctionalInterface 
interface HelloWorld {
	String sayHello(String name);
} 
public class LambdaExpressionExample {

	public static void main(String args[]){
		HelloWorld helloWorld = (String name) -> { return "Hello " + name; };
		 System.out.println(helloWorld.sayHello("Raushan"));
	}
}
