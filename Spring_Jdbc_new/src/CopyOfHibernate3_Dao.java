import org.springframework.orm.hibernate3.HibernateTemplate;


public class CopyOfHibernate3_Dao {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveHibernate3(Hibernate3 h3)

	{
		template.save(h3);
	}
  public void updateHibernate(Hibernate3 h3)
  {
	  template.update(h3);
  }
  
  public void deleteHibernate3(Hibernate3 h3)
  {
	  template.delete(h3);
  }
}
