
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class QueryUpdate {
	public static void main(String[] args) {
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory sf=conf.buildSessionFactory();
Session hsession=sf.openSession();
Transaction tx=hsession.beginTransaction();


Query query=hsession.createQuery("update Hiberdemo set email=:n where id=:i");

query.setParameter("n","goutham@testing.com");

query.setParameter("i","7");

int count=query.executeUpdate();
tx.commit();

hsession.close();
sf.close();


	}

}
