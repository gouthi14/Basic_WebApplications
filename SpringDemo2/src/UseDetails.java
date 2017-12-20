import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class UseDetails {
public static void main(String args[])
{
	Resource rc=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(rc);
	Details details=(Details)factory.getBean("demo");
	details.details_info();
	
	
}
}
