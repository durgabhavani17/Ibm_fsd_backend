package Examples;

public class ObjectArray {
   int id;
   String name;
   int age;
   int salary;
public ObjectArray(int id, String name, int age, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void printDetails() {
	System.out.println(id+","+name+","+age+","+salary);
}
public void updateDetails() {
	name="bhavani";
}
 public void search(int id) {
	if(this.id==id) {
		System.out.println("id found");
	}
 }
}