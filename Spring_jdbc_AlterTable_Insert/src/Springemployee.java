import org.springframework.jdbc.core.JdbcTemplate;


public class Springemployee {

	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void Alter_table()
	{
		int query=jdbcTemplate.update("insert into Springemployee values(222,'gouthamm','hyderabad')");
		System.out.println("Statement executed"+query);
		
				
	}
	
	public void Update_table()
	{
		int count=jdbcTemplate.update("update Springemployee set name='venkat' where id=1");
		System.out.println("Statement is executed"+count);
	}

public void Delete_table()
{
	int count1=jdbcTemplate.update("delete from Springemployee where id=121");
	System.out.println("Statement is executed"+count1);
	
}
public void Add_cloumn()
{
	int count2=jdbcTemplate.update("ALTER TABLE Springemployee ADD department varchar(20)");
	System.out.println("column added to table"+count2);
	
}

public void Insert_new()
{
	int count3=jdbcTemplate.update("update Springemployee set department='thop' where id=2");
	System.out.println("new data inserted"+count3);
	
}
}

