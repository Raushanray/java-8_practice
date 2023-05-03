package java_interview;

public class Employee implements Comparable<Employee>{
	
	String eId;
	String name;
	String dept;
	int age;
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age -o.age;
	}
	
	
	public Employee(String eId, String name, String dept, int age) {
		super();
		this.eId = eId;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	
	
	

}
