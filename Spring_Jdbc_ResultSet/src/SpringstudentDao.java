import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


public class SpringstudentDao {

	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Springstudent>getAllStudents()
	{
		return jdbcTemplate.query("select *from Springstudent", new ResultSetExtractor<List<Springstudent>>()
				{
			public List<Springstudent>extractData(ResultSet rs)
			throws SQLException,DataAccessException
			{
			List<Springstudent> list=new ArrayList<Springstudent>();
			while(rs.next())
			{
				Springstudent ss=new Springstudent();
				ss.setId(rs.getInt(1));
				ss.setName(rs.getString(2));
				ss.setDepartment(rs.getString(3));
				ss.setSchool(rs.getString(4));
				list.add(ss);
			}
				return list;
			}
			
			
				});
	}
	
}
