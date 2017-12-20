import org.springframework.jdbc.core.JdbcTemplate;


public class Springstudent {

	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	void insertData()
	{
		int count=jdbcTemplate.update("");
		System.out.println("knount the numbwer:"+count );
	}
}
