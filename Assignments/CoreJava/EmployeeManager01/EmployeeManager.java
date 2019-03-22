public class EmployeeManager {

    static int ind;

    public static void addEmp() {

    }

    public static void main(String[] args) {
        // Declaring employee array
        Employee empList[] = new Employee[50];

        // Adding employees to employee array
        empList[0] = new Employee("Iron Man", 31, "IT", 95000, "Male");
        empList[1] = new Employee("Hulk", 37, "Gamma", 87000, "Male");
        empList[2] = new Employee("Scarlett", 29, "Shield Agent", 55000, "Female");
        empList[3] = new Employee("Captain America", 42, "IT", 65000, "Male");

        System.out.println("ID\tName\tAge\tGender\tDepartment\tSalary");
        for (Employee emp : empList) {
            if (emp == null)
                continue;
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getAge() + "\t" + emp.getGender() + "\t"
                    + emp.getDepartment() + "\t\t" + emp.getSalary());
        }

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] != null && empList[i].getId() == 2)
                empList[i] = null;
        }

        System.out.println("After Delete");
        for (Employee emp : empList) {
            if (emp == null)
                continue;
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getAge() + "\t" + emp.getGender() + "\t"
                    + emp.getDepartment() + "\t\t" + emp.getSalary());
        }

        for (int i = 0; i < empList.length; i++) {
            if (empList[i] != null && empList[i].getId() == 1)
                empList[i].setName("Harshit");
            ;
        }

        System.out.println("After Update");
        for (Employee emp : empList) {
            if (emp == null)

                continue;
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getAge() + "\t" + emp.getGender() + "\t"
                    + emp.getDepartment() + "\t\t" + emp.getSalary());
        }
    }

}
