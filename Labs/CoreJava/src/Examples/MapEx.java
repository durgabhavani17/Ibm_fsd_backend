package Examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
		Comparator comp=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Employee&& o2 instanceof Employee)
				{
					
					return ((Employee)o1).getName().compareTo(((Employee)o2).getName());
				}
				return 0;
			}
			
		};
		Map employees=new HashMap();
		Employee<Integer,Map> e=new Employee(23,"vandana", 20,"female", 40000,"developer");
   employees.put(100,new Employee<Integer,Employee>(20,"durga", 20,"female", 30000,"developer") );
   employees.put(101,new Employee(21,"vandana", 20,"female", 40000,"developer") );
   employees.put(102,e);
     for(Object emp:employees.values()) {
    	 System.out.println(emp);
     }
     e.avgSalary(employees);
	}
	
	
}
