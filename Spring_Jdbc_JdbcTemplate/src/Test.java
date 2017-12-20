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
		
		dao.saveEmployee(new Springemployee(66,"simple"));
		
		dao.updateEmployee(new Springemployee("keerthi",1));
		
		dao.deleteEmployee(new Springemployee(55));
		
		
	}

}
