package EmployeeManagement;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MethodReferences {
	public static void main(String[] args) {
		MethodReferences me=new MethodReferences();
		String[] CountryArray= {"India","America","London",""};
		
		Collection<String> list=Arrays.asList(CountryArray);
		long count=list.stream().filter(e->e.isEmpty()).count();
		System.out.println(count);
		list.forEach(me::displayItem);
		Supplier<List<String>> citylist = ()->{return new ArrayList<String>();};
		List<String> cities=citylist.get();
		System.out.println(cities);
		
	}
	public void displayItem(String item) {
		System.out.println(item);
	}

}
