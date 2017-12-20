import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Access {
public static void main(String args[])
{
	//Resource rs=new ClassPathResource("applicationContext.xml");
	//BeanFactory fa=new XmlBeanFactory(rs);
	
	
	
	ApplicationContext fa=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee_Salary es=(Employee_Salary)fa.getBean("obj1");
es.fruit_info();
	
	
}
}
