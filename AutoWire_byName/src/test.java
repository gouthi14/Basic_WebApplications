import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resource rs=new ClassPathResource("applicationContext.Xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Office office=(Office)factory.getBean("ofc");
		office.employee_info();
	}

}
