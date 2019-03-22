package Examples;

public class Contractor extends Person {
	int id;
	String des;
	int salary;

	public Contractor(String name, int age, String gender, int id, String des, int salary) {
		super(name, age, gender);
		this.id = id;
		this.des = des;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void printContractorDetails() {
		System.out.println(getName()+","+getAge()+","+getGender()+","+id+","+des+","+salary);
	}

	public void printEmployeeDetail() {};
}
