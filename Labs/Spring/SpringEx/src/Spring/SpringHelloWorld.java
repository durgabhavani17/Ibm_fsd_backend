package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringHelloWorld {

	public static void main(String[] args) {
		Greetings g=new Greetings();
		System.out.println(g.getMsg());
		//craete ioc container
		//access greeting bean
		//print the message
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans_Config.xml");
		Greetings greetings=(Greetings)con.getBean("greetings");
		System.out.println(greetings.getMsg());
		System.out.println(greetings.getA());
		
}

}