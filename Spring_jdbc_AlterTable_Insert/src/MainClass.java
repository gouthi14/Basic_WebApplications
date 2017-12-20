import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
	Springemployee obj=(Springemployee)act.getBean("sdao");
	
	
	obj.Insert_new();
	
	
	
	
	
	
	}

}
