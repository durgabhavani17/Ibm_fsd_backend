package Jdbc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
public static void main(String[] args) throws Exception  {
	Class<?> c=Calculator.class;
	Constructor<?> con=c.getConstructor();
	Object ob=con.newInstance();
	
	Method add =c.getMethod("add", Integer.class,Integer.class);
	Object res=add.invoke(ob, 10,20);
	System.out.println("addition ="+res);
	
	Method sub =c.getMethod("sub", Integer.class,Integer.class);
	 res=sub.invoke(ob, 10,20);
	System.out.println("substraction ="+res);
	
	Method mul =c.getMethod("mul", Integer.class,Integer.class);
	 res=mul.invoke(ob, 10,20);
	System.out.println("multiplication ="+res);
	
	Method div =c.getMethod("div", Integer.class,Integer.class);
	 res=div.invoke(ob, 10,20);
	System.out.println("division ="+res);
	
}
}
