package singletonPattern;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = Employee.getInstance();
		Employee e2 = Employee.getInstance();
		
		e1.setAddress("123 Sesame St");
		e1.setDob("01/01/1990");
		e1.setName("Federick Umbride");
		
		e2.setSalary(100000);
		e2.setSsn(1234567891);
		
		e1.display();
		System.out.println("-------------------------------");
		e2.display();
		
		


	}

}
