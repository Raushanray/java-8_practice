package lambda.expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("sitaram");
		list.add("sita");
		list.add("gita");
		list.add("syam");
		list.add("pawan");
		list.add("kheshari");
		list.add("lal");
		list.add("yadav");
		list.forEach((name)-> System.out.println(name));
	}
	
}
