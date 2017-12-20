import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class UseFruit 
{
public static void main(String args[])
{
	Resource r=new ClassPathResource("applicationContext.xml");
	
	BeanFactory factory=new XmlBeanFactory(r);
	
	Fruit fruit=(Fruit)factory.getBean("demo");
	
	fruit.fruit_inf0();
}
}
