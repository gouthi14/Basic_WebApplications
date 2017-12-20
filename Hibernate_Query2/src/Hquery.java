import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Hquery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory sf=conf.buildSessionFactory();
Session hsession=sf.openSession();
//Transaction tx=hsession.beginTransaction();



Query q=hsession.createQuery("from Hiberdemo where id='7' ");

//q.setFirstResult(3);

List<Hiberdemo> list=q.list();
for(Hiberdemo hd :list )
{
	//System.out.println(hd.getId());
	System.out.println(hd.getName());
	
	System.out.println(hd.getEmail());
	
	System.out.println(hd.getPhone());
}



}}