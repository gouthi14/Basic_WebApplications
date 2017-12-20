import org.springframework.jdbc.core.JdbcTemplate;


public class SpringemployeeDao {
 
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Springemployee s)
	{
		String query="insert into Springemployee values('"+s.getId()+"','"+s.getName()+"')";
	return jdbcTemplate.update(query);
	
	}
	
	public int updateEmployee(Springemployee s1)
	{
		String query1="update Springemployee set name='"+s1.getName()+"' where id='"+s1.getId()+"'";
		return jdbcTemplate.update(query1);
	}
	
	public int deleteEmployee(Springemployee s2)
	{
		String query2="delete Springemployee where id='"+s2.getId()+"'";
		return jdbcTemplate.update(query2);
	}
	
}
