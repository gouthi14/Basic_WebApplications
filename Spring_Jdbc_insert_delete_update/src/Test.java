import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	SpringstudentDao dao=(SpringstudentDao)act.getBean("sdao");
	dao.saveStudentbyPrepared(new Springstudent(2,"twotimes","two","tee"));
   
	
	dao.updateStudentbyPrepared(new Springstudent(11,"keerthhhi"));
	
	
	dao.deleteStudentbyPrepared(new Springstudent(1));
	
	}

}
