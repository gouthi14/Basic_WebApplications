import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Retrive2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory sf=conf.buildSessionFactory();
Session hsession=sf.openSession();
Query q=hsession.createQuery("from Hiberdemo");
List<Hiberdemo> list=q.list();
for(Hiberdemo hd:list)
{
	System.out.println("THIS IS YOUR TABLE DETAILS");
	System.out.println("ID:"+hd.getId());
	System.out.println("NAME:"+hd.getName());
	System.out.println("EMAIL:"+hd.getEmail());
	System.out.println("PHONE:"+hd.getPhone());
}


	}

}
