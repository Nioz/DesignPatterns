package singletonPattern;

public class Employee {
	//Restricted
	private int ssn;
	private int salary;
	//Profile data
	private String name;
	private String address;
	private String dob;
	private static Employee uniqueInstance;
	
	public Employee() {
		this.ssn = 0000000000;
		this.salary = 0;
		this.name = "none";
		this.address = "none";
		this.dob = "none";
	}

	public static Employee getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Creating a unique employee profile");
			uniqueInstance = new Employee();
		}
		System.out.println("Returning instance of Employee Profile");
		return uniqueInstance;
	}
	
	//setters
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	//Getters
	public int getSsn() {
		return ssn;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void display() {
		System.out.println(
				"***Public Info***" + "\n" +
				"Name: " + name + "\n" + 
				"Address: " + address + "\n" +
				"Date of Birth: " + dob + "\n" +
				"***Private info***" + "\n" +
				"Salary: " + salary + "\n" +
				"Social Security Number: " + ssn);
	}

	
	

}
