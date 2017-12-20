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
Session hsession=sf.openSession();
Object obj=hsession.load(Hiberdemo.class,new Integer(5));
Hiberdemo h=(Hiberdemo)obj;
Transaction tx=hsession.beginTransaction();
h.setEmail("www.update@gmail.com");
tx.commit();
System.out.println("Row updated");

Object obj1=hsession.load(Hiberdemo.class,new Integer(6));
Hiberdemo h1=(Hiberdemo)obj1;
Transaction t1=hsession.beginTransaction();
hsession.delete(h1);
t1.commit();
System.out.println("Row deleted");
hsession.close();
sf.close();
	}

}
