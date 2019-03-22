package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import Examples.Employee;

public class ListEx {

	public static void main(String[] args) {
		
         Employee emp=new Employee(20,"durga", 20,"female", 30000,"developer");
        Set hash=new HashSet();
         hash.add(emp);
         hash.add(new Employee(30,"bahvani", 20,"female", 379000,"developer"));
        for(Object i:hash) {
        	System.out.println(i);
        }
         
         Iterator itr=hash.iterator();
         while(itr.hasNext()) {
        	 Object obj=itr.next();
        	 System.out.println(obj);
         }
         for(Object i:hash) {
         System.out.println(i.hashCode());
         }
	}
	
	
	
}
