import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory session=conf.buildSessionFactory();
		Session hsession=session.openSession();
		Transaction tx=hsession.beginTransaction();
		Hiber1 obj=new Hiber1();
		obj.setId(3);
		obj.setFirstName("aaa");
		obj.setLastName("nnn");
		hsession.persist(obj);
		System.out.println("Data inserted");
		tx.commit();
		
		Object obj1=hsession.load(Hiber1.class, new Integer(1));
		Hiber1 h1=(Hiber1)obj;
		hsession.delete(h1);
		System.out.println("one row deleted");
		Transaction t=hsession.beginTransaction();
		
		
		
		t.commit();
		
		hsession.close();
		
		
		
	}

}
