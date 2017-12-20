

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cf=new Configuration();
cf.configure("hibernate.cfg.xml");
SessionFactory sf=cf.buildSessionFactory();
Session hsession=sf.openSession();
Transaction tx=hsession.beginTransaction();
Hiber obj=new Hiber();
obj.setId('5');
obj.setName("bbb");
hsession.persist(obj);
tx.commit();
hsession.close();

	}

}
