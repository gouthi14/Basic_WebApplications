import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class HelloFruit {
public static void main(String args[])
{
	Resource res=new ClassPathResource("applicationContext.xml");
	
	BeanFactory factory=new XmlBeanFactory(res);
	
	FruitApp fa=(FruitApp)factory.getBean("fruit");
	fa.fruit_info();
	
}
}
