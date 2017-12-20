import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;


public class SpringemployeeDao {
 
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean saveEmployeebyPrepared(final Springemployee s)
	{
		String str="insert into Springemployee values(?,?)";
		return jdbcTemplate.execute(str,new PreparedStatementCallback<Boolean>()
				{
			public Boolean doInPreparedStatement(PreparedStatement ps)
			throws SQLException,DataAccessException
			{
				ps.setInt(1,s.getId());
				ps.setString(2, s.getName());
				return ps.execute();
			}
				});
	}
	
	public boolean updateEmployeebyPrepared(final Springemployee s1)
	{
		String str1="update Springemployee set name=? where id=?";
		return jdbcTemplate.execute(str1,new PreparedStatementCallback<Boolean>()
				{
			public Boolean doInPreparedStatement(PreparedStatement ps1)
			throws SQLException,DataAccessException
			{
				ps1.setString(1, s1.getName());
				ps1.setInt(2, s1.getId());
				return ps1.execute();
			}

			
				});
	}
	
	public boolean deleteEmployeebyPrepared(final Springemployee s2)
	{
		String str2="delete from Springemployee where id=?";;
		return jdbcTemplate.execute(str2,new PreparedStatementCallback<Boolean>()
				{
			public Boolean doInPreparedStatement(PreparedStatement ps2)
			throws SQLException,DataAccessException
			{
				ps2.setInt(1, s2.getId());
				return ps2.execute();
			}
				});
	}
	
	
	
}
