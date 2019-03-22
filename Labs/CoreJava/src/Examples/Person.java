package Examples;
//Can't create instance
public abstract class Person {
	 private String name;
	 private int age;
	 private String gender;
	public Person(String name,int age,String gender) {
		this.name=name;
		this.gender=gender;
		this.age=age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public abstract void printEmployeeDetail();
	public abstract void printContractorDetails();
}
