import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Hquery {
public static void main(String[] args)
{
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session hsession=sf.openSession();
	
	
	Transaction tx=hsession.beginTransaction();
	
	Query query=hsession.createQuery("update Hiberdemo set name=:n where id=:i");
		
	query.setParameter("n","keerthi");
	query.setParameter("i",7);
	
	int count=query.executeUpdate();
	tx.commit();
	hsession.close();
	sf.close();
	
	
}}	