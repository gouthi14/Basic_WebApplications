import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Springstudent obj=(Springstudent)act.getBean("sdao");
	obj.insertData();
	}

}
