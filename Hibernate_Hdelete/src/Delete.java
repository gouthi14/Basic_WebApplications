import org.hibernate.Query;
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
Transaction tx=hsession.beginTransaction();
Query q=hsession.createQuery("delete Hiberdemo where id=:i");

q.setParameter("i", 3);
int count=q.executeUpdate();
tx.commit();
hsession.close();
sf.close();
	}

}
