import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Access {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource rs=new ClassPathResource("applicationContext.xml");
BeanFactory factory=new XmlBeanFactory(rs);
Cons cons=(Cons)factory.getBean("cons1");
cons.cons_info();

	}

}