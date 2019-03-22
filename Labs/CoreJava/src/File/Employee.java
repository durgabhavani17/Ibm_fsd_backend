package File;

public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 6901343473681795779L;
	String name;
	transient int id;
	int salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
