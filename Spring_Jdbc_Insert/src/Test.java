import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringstudentDao ssd=(SpringstudentDao)ctx.getBean("sdao");
		
		ssd.saveStudentbyprepared(new Springstudent(13,"venkata","java","anna"));
	}

}
