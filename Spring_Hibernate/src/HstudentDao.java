import org.springframework.orm.hibernate3.HibernateTemplate;


public class HstudentDao {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveHstudent(Hstudent hs)
	{
		template.save(hs);
	}
	public void updateHstudent(Hstudent hs1)
	{
		template.update(hs1);
		
	}
	public void deleteHstudent(Hstudent hs2)
	{
		template.delete(hs2);
	}
}
