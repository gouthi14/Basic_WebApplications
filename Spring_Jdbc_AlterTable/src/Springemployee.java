import org.springframework.jdbc.core.JdbcTemplate;


public class Springemployee {
 
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void Alter_table()
	{
		int count=jdbcTemplate.update("ALTER TABLE Springemployee ADD addrees varchar(20)");
		System.out.println("Sql count is:"+count);
	}
	public void Insert_NewDta()
	{
		int count1=jdbcTemplate.update("insert into Springemployee(id,addrees,department)values(333,'tirumula','java')");
	System.out.println("Data inserted"+count1);
	}
	
}
