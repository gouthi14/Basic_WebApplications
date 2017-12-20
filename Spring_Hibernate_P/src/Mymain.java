import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mymain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		HstudentDao obj=(HstudentDao)act.getBean("dao");
		Hstudent hs=new Hstudent();
		hs.setId(5);
		hs.setName("venkat");
		hs.setDepartment("hibernate");
		obj.saveHstudent(hs);
		
		Hstudent hs1=new Hstudent();
		hs1.setId(3);
		
	obj.deleteHstudent(hs1);
	
	Hstudent hs2=new Hstudent();
	hs2.setId(8);
	hs2.setName("goutham");
	hs2.setDepartment("up2");
	obj.updateHstudent(hs2);
		
		
		
		
		
		
	}

}
