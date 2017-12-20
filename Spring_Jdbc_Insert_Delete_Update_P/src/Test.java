import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringemployeeDao dao=(SpringemployeeDao)act.getBean("edao");
		dao.saveEmployeebyPrepared(new Springemployee(55,"practice"));
		
		
		dao.updateEmployeebyPrepared(new Springemployee("goutham",2));
		
		dao.deleteEmployeebyPrepared(new Springemployee(11));
		
	}

}
