import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Update {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Configuration conf=new Configuration();
     conf.configure("hibernate.cfg.xml");
     SessionFactory sf=conf.buildSessionFactory();
     Session session=sf.openSession();
     Object obj=session.load(Hiberdemo.class, new Integer(5));
     Hiberdemo h=(Hiberdemo)obj;
     Transaction tx=session.beginTransaction();
     h.setEmail("testing@update.com");
     System.out.println("row updated");
     tx.commit();
     session.close();
     sf.close();
     
	}

}
