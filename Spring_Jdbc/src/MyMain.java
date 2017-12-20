import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyMain {
	
	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	SprinEmployeeDao obj=(SprinEmployeeDao)ctx.getBean("empDao");
	
obj.saveEmployeeByPrepared(new Springemployee(5,"ggg"));
	}
}
