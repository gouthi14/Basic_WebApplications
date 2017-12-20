import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;


public class SprinEmployeeDao {

	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean saveEmployeeByPrepared(final Springemployee e)
	{
		
		String str="insert into springemployee values(?,?)";
		return jdbcTemplate.execute(str,new PreparedStatementCallback<Boolean>()
		{
			@Override
			
			
			public Boolean doInPreparedStatement(PreparedStatement ps)
			throws SQLException,DataAccessException
			{
				ps.setInt(1,e.getId());
				ps.setString(2,e.getName());
				return ps.execute();
			}
		});
	}
	
}
