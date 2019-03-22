
  package Examples;
  
  public class EmployeeDemo {public static void main(String[] args) { 
	  Person p;
 Employee e=new Employee("bhavani",20,"female",30000,"developer");
 e.appraise();
  
  e.printEmployeeDetail();
  
  System.out.println("@@@@@@@@@@contract employee@@@@@@@@@@@"); 
  p=new Contractor("vandana",19,"female",2345,"sap",60000);
  p.printContractorDetails();
  
  }}
 