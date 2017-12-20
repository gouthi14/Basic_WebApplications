import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MianClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Hibernate3_Dao obj=(Hibernate3_Dao)act.getBean("dao");
		 Hibernate3 h3=new Hibernate3();
		 h3.setId(1);
		 h3.setName("name");
		 h3.setSalary(500);
		 obj.saveHibernate3(h3);
	}

}
