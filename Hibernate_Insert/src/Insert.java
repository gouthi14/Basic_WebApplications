import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Insert {
public static void main(String[] args)
{
	Configuration conf=new Configuration();
	
	conf.configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session hsession=sf.openSession();
	Transaction tx=hsession.beginTransaction();
	Hiberdemo obj=new Hiberdemo();
	obj.setId(6);
	obj.setName("GOUTHI");
	obj.setEmail("GOUTHI@gmail.com");
	obj.setPhone("7892365755");
	hsession.persist(obj);
	tx.commit();
	hsession.close();
}
}
