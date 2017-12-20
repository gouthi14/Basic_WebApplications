import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class action {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory sf=conf.buildSessionFactory();
Session hsession=sf.openSession();
 
Object obj=hsession.load(Hiber.class,new Integer(3));

Hiber h=(Hiber)obj;

Transaction tx=hsession.beginTransaction();


h.setName("tum bin");

tx.commit();
hsession.close();
sf.close();

	}

}
