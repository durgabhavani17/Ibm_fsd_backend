package SimpleEmployee;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class Employee {
	public Integer id;
	public String name;
	public Integer age;
	public String designation;
	public List skills;
	@Autowired
	public Address address;
	public LocalDate dob;
	public boolean contractor;
	public Employee() {
		
	}
	public Employee(Integer i, String name, LocalDate localDate, Integer age, String des, java.util.List list, Address address, Boolean contractor) {

		this.id=i;
		this.name=name;
		this.age=age;
		this.designation=des;
		this.skills=list;
		this.address=address;
		this.contractor=contractor;
		this.dob=localDate;
		
		
	}
	 public Integer getId() {
		return id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",dob="+dob+", age=" + age + ", designation=" + designation + ", skills="
				+ skills + ", address=" + address + ", contractor=" + contractor + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isContractor() {
		return contractor;
	}
	public void setContractor(boolean contractor) {
		this.contractor = contractor;
	}
	
	
	
	

}
