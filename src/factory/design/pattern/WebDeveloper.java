package factory.design.pattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting Web Developer Salary..");
		return 400000;
	}

}
