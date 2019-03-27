package com.examples.java.jsp.employee;
/*
 * package com.examples.java.jsp.employeeManagement;
 * 
 * import java.time.LocalDate; import java.time.Period; import
 * java.time.format.DateTimeFormatter; import
 * java.time.format.DateTimeParseException; import java.util.Scanner; import
 * java.util.concurrent.Callable; import java.util.concurrent.ExecutorService;
 * import java.util.concurrent.Executors; import java.util.concurrent.Future;
 * 
 * import
 * org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.context.support.AbstractApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext; import
 * org.springframework.stereotype.Component;
 * 
 * 
 * 
 * public class EmployeeManagement {
 * 
 * public interface ValidateEmployee { public boolean check(int age, double
 * salary); } static boolean validate(ValidateEmployee validator, int age,
 * double salary) { return validator.check(age, salary); }
 * 
 * 
 * public static void main(String[] args) {
 * 
 * //AbstractApplicationContext context = new
 * ClassPathXmlApplicationContext("Bean_Config.xml");
 * //AbstractApplicationContext context = new
 * AnnotationConfigApplicationContext(EmployeeConfiguration.class);
 * //EmployeeService1 obj = (EmployeeService1) context.getBean("employee");
 * 
 * Scanner sc=new Scanner(System.in); EmployeeService1 obj=new
 * EmployeeService1(); boolean bool=false; while(!bool) {
 * System.out.println("Menu"); System.out.println("1.add an Employee");
 * System.out.println("2.update an Employee");
 * System.out.println("3.list of employees");
 * System.out.println("4.delete employee by id");
 * System.out.println("5.list employee by Id");
 * System.out.println("6.print statistics"); System.out.println("7.Import");
 * System.out.println("8.Export"); System.out.println("9.exit");
 * System.out.println("Enter the option which u want to perform"); int
 * option=Integer.parseInt(sc.nextLine()); switch(option) { case 1: try {
 * 
 * System.out.println("enter employee name"); String name = sc.nextLine();
 * boolean flag = false; String rename = "[a-zA-Z ]+"; while (!flag) { if
 * ((!name.isEmpty() && name.matches(rename))) {
 * 
 * flag = true;
 * 
 * } else { System.out.println("enter only alphabets or please enter ur name");
 * name = sc.nextLine(); } } System.out.println("enter employee salary");
 * 
 * String sal = sc.nextLine(); boolean b = false; String str = "[0-9]+"; while
 * (!b) { if (sal.toString().matches(str)) {
 * 
 * b = true; } else { System.out.println("enter only numbers"); sal =
 * sc.nextLine(); } } Double salary = Double.parseDouble(sal); DateTimeFormatter
 * format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
 * System.out.println("enter ur date of birth");
 * 
 * String dob = sc.nextLine(); LocalDate dob1 = LocalDate.parse(dob, format);
 * 
 * LocalDate today = LocalDate.now(); Period p = Period.between(dob1, today);
 * 
 * int age = p.getYears(); boolean flag4 = true; while (flag4) { boolean
 * ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000
 * 
 * , age, salary);
 * 
 * if (ageValue) { System.out.println("valid age and salary"); flag4 = false; }
 * else { System.out.println("invalid age or salary");
 * System.out.println("enter employee age"); age =
 * Integer.parseInt(sc.nextLine()); System.out.println("enter employee salary");
 * salary = Double.parseDouble(sc.nextLine()); } }
 * System.out.println("enter employee designation"); String des = sc.nextLine();
 * boolean flag2 = true; while (flag2) { if (!des.isEmpty() &&
 * des.matches(rename)) { flag2 = false; } else {
 * System.out.println("enter only alphabets"); des = sc.nextLine(); } }
 * System.out.println("enter employee department"); String dep = sc.nextLine();
 * boolean flag9 = true; while (flag9) { if (!dep.isEmpty() &&
 * dep.matches(rename)) { flag9 = false; } else {
 * System.out.println("enter only alphabets"); dep = sc.nextLine(); } }
 * obj.addEmployee(new Employee(name, salary, dob, age, des, dep));
 * }catch(DateTimeParseException e) {
 * System.err.println("enter the date in yyyy/mm/dd format"); }
 * 
 * break; case 2: System.out.println("enter employee key to update");
 * 
 * int uid=Integer.parseInt(sc.nextLine());
 * System.out.println("enter employee name"); String name = sc.nextLine();
 * boolean flag = false; String rename = "[a-zA-Z ]+"; while (!flag) { if
 * ((name.matches(rename))) {
 * 
 * flag = true;
 * 
 * } else { System.out.println("enter only alphabets"); name = sc.nextLine(); }
 * } System.out.println("enter employee salary"); String salary2 =
 * sc.nextLine();
 * 
 * String str = "[0-9]+"; boolean flag1 = false; while (!flag1) { if
 * ((salary2.matches(str))) {
 * 
 * flag1 = true;
 * 
 * } else { System.out.println("enter only numbers"); salary2 = sc.nextLine(); }
 * } Double salary = Double.parseDouble(salary2);
 * 
 * DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
 * System.out.println("enter ur date of birth"); String dob = sc.nextLine();
 * LocalDate dob1 = LocalDate.parse(dob, format);
 * 
 * LocalDate today = LocalDate.now(); Period p = Period.between(dob1, today);
 * 
 * int age = p.getYears(); boolean flag2 = true; while (flag2) { boolean
 * ageValue = validate((age1, salary1) -> age1 > 20 && salary1 > 30000
 * 
 * , age, salary);
 * 
 * if (ageValue) { System.out.println("valid age and salary"); flag2 = false; }
 * else { System.out.println("invalid age or salary");
 * System.out.println("enter employee age"); age =
 * Integer.parseInt(sc.nextLine()); System.out.println("enter employee salary");
 * salary = Double.parseDouble(sc.nextLine()); } }
 * System.out.println("enter employee designation"); String des = sc.nextLine();
 * boolean flag3 = true; while (flag3) { if (!des.isEmpty() &&
 * des.matches(rename)) { flag3 = false; } else {
 * System.out.println("enter only alphabets"); } }
 * 
 * 
 * obj.updateEmployee(uid,name,salary,dob,age,des); break; case 3:
 * obj.listEmployees(); break; case 4:
 * System.out.println("enter the key which u want to delete"); int did =
 * Integer.parseInt(sc.nextLine()); obj.deleteEmployee(did); break; case 5:
 * System.out.println("enter the employee key which u want to fetch"); int kid =
 * Integer.parseInt(sc.nextLine()); obj.listEmployeeById(kid); break;
 * 
 * case 6: obj.printStatistics(); break;
 * 
 * case 7: Callable<Boolean> importThread=new Callable<Boolean>(){
 * 
 * @Override public Boolean call() throws Exception {
 * System.out.println(Thread.currentThread()+"triggred"+"wait for 5 sec");
 * Thread.sleep(5000); obj.importFile(); return null; } };
 * 
 * ExecutorService e = Executors.newFixedThreadPool(2); Future<Boolean>
 * res=e.submit(importThread);
 * 
 * System.out.println("import triggered"); e.shutdown();
 * 
 * break; case 8: Callable<Boolean> exportThread=new Callable<Boolean>(){
 * 
 * @Override public Boolean call() throws Exception {
 * System.out.println(Thread.currentThread()+"triggred"+"wait for 5 sec");
 * Thread.sleep(5000); obj.exportFile(); return null; } };
 * 
 * ExecutorService e1 = Executors.newFixedThreadPool(2); Future<Boolean>
 * res1=e1.submit(exportThread); System.out.println("export triggered");
 * e1.shutdown(); break; case 9: obj.exit();
 * 
 * break; default: System.out.println("enter the correct option"); break;
 * 
 * } }
 * 
 * }
 * 
 * }
 */