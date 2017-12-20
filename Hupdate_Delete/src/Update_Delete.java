import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Update_Delete {

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
Query q=hsession.createQuery("update Hiberdemo set email=:n where id=:i");

q.setParameter("n", "changind.data@java.com");
q.setParameter("i", 1);
int count=q.executeUpdate();
System.out.println("the email updated");


Query q2=hsession.createQuery("delete Hiberdemo where id=:i");
q2.setParameter("i", 3);
int count1=q2.executeUpdate();
System.out.println("row deleted");
tx.commit();
hsession.close();
sf.close();





	}

}
