package EmployeeMaanger01;

public class EmployeeManager {

	public static void main(String[] args) {
		Employee emp=new Employee(1234,"durga",20,30000);
		Employee emp2=new Employee(1235,"murali",26,60000);
		Employee emp3=new Employee(1236,"vandana",19,30000);
		Employee emp4=new Employee(1237,"rathna",20,90000);
		Employee[] empp=new Employee[] {emp,emp2,emp3};
		System.out.println("*******employee details********");
		   
		for(int i=0;i<3;i++) {
			empp[i].printDetails();
		}
		System.out.println("******updated employee details*****");
		
		
			empp[0].updateDetails();
			for(int i=0;i<3;i++) {
				empp[i].printDetails();
			}
		System.out.println("******after deletion  employee details*****");
			
			
			for(int i=0;i<3;i++) {
				empp[i].printDetails();
			}
			
	}
	

}
