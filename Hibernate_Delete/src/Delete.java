import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory sf=conf.buildSessionFactory();
Session hsession=sf.openSession();
Object obj=hsession.load(Hiber.class, new Integer(3));

Hiber h1=(Hiber)obj;

Transaction t=hsession.beginTransaction();

hsession.delete(h1);
t.commit();
hsession.close();
sf.close();

	}

}
