public class Employee {
	
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return_name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return_age;
	}
	
	@Override
	public String toString() {
		return_"Employee [name=" + name + ", age = " + age "]";
	}


import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	public static void main(String[] args) {
		
		ArrayList<Employee> employees3 = new ArrayList<Employee>();
		employees3.add(new Employee("Siwon3", 33));
		employees3.add(new Employee("John3", 22));

		Employee e3 = new Employee("Ric3", 20);
		Employee e4 = new Employee("Jake3", 29);		

		employees3.add(e3);
		employees3.add(e4);

		System.out.println("0. 인덱스를 통한 하나씩 조회");

		String emp0 = employees3.get(0).toString();

//		String emp1 = employees3.get(1).toString();

//		String emp2 = employees3.get(2).toString();

		System.out.println("인덱스를 통한 하나씩 조회: " + emp0);

	}
}
