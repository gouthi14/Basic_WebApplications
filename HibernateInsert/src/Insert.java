

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Insert {


public static void main(String[] args){
	Configuration confi=new Configuration();
	confi.configure("hibernate.cfg.xml");
	SessionFactory sf=confi.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tc=session.beginTransaction();
	Hiber obj=new Hiber();
	obj.setId(3);
	obj.setName("test");
	session.persist(obj);
	tc.commit();
	session.close();
	
	
}
}