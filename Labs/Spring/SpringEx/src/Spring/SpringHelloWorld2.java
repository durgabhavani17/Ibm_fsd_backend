package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringHelloWorld2 {

	public static void main(String[] args) {
		Greetings g=new Greetings();
		System.out.println(g.getMsg());
		//craete ioc container
		//access greeting bean
		//print the message
		Resource resource=new ClassPathResource("Bean_config.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
		
}

}