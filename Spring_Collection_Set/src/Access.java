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

		
		
		Resource rs=new ClassPathResource("applicationContext.Xml");
		BeanFactory fa=new XmlBeanFactory(rs);
		University ui=(University)fa.getBean("college1");
		ui.university_info();
		
	}

}
