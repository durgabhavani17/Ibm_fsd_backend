package Examples;

public class Employee<T extends Number,S> extends Person implements Appraisable {

	private static int id = 10;
	private T salary;
	private String designation;
	
	@Override
	public int hashCode() {
		return (int)salary*(int)salary;
	}

	
	public void avgSalary(S emp) {
		int avg;
		for(T sal:((Object) emp).(T)getSlary()) {
			
			avg+=(int)salary;
		}
		System.out.println(avg/2);
	}

	

	public Employee(int id,String name, int age, String gender, T salary, String designation) {
		super(name, age, gender);
		this.salary = salary;
		this.designation = designation;
		this.id=id;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Employee.id = id;
	}

	public T getSalary() {
		return salary;
	}
	public  void printContractorDetails() {};

	public void setSalary(T salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
 
	public  void printEmployeeDetail() {
		System.out.println(Employee.id + "," + getName() + "," + salary + "," + designation + "," + getAge() + "," + getGender());
	}

	public void updateEmployee(int id, T salary) {
		this.id = id;
		this.salary = salary;
		System.out.println("modified employee details are");
		System.out.println(this.id + "," + getName() + "," + this.salary + "," + designation + getAge() + "," + getGender());
	}
	public void appraise() {
		salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation +",name="+getName()+ "]";
	}

	
	

}
