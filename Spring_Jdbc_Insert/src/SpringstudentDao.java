import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;


public class SpringstudentDao {

	
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public boolean saveStudentbyprepared(final Springstudent s)
	{
		String str="insert into Springstudent values(?,?,?,?)";
		return jdbcTemplate.execute(str,new PreparedStatementCallback<Boolean>()
				{
			public Boolean doInPreparedStatement(PreparedStatement ps)
			throws SQLException,DataAccessException
			{
				ps.setInt(1,s.getId());
				ps.setString(2,s.getName());
				ps.setString(3,s.getDepartment());
				ps.setString(4,s.getSchool());
				return ps.execute();
			}
			
				});
	}
	
}
