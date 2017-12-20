package org.springframework.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.spring.domain.Person;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("personService")
@Transactional
public class PersonService 
{

	protected static Logger logger=Logger.getLogger("service");
	private SimpleJdbcTemplate jdbcTemplate;
	
	@Resource(name="dataSource")
	
	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate=new SimpleJdbcTemplate(dataSource);
	}
	
	//RETRIVING THE PERSON INFO:
	
	
	public List<Person> getAll()
	{
		logger.debug("Retriving the person's Info");
		
		String sql="select id,firstName,lastName,amount from person";
		
		RowMapper<Person>mapper=new RowMapper<Person>()
		{
			
			public Person mapRow(ResultSet rs,int rowNum)throws SQLException
			{
				Person p=new Person();
				
				p.setId(rs.getInt("id"));
				
				p.setFirstName(rs.getString("firstName"));
				p.setLastName(rs.getString("lastName"));
				p.setAmount(rs.getInt("amount"));
				return p;
			}
		};
		
		return jdbcTemplate.query(sql,mapper);
	}
	
	//Add a new info in Person
	
	public void add(String firstName,String lastName,int amount)
	{
		logger.debug("Adding new Person");
		String sql="insert into person (firstName,lastName,amount)values"+"(:firstName,:lastName,:amount)";
	
	//Assign values in table
	Map<String,Object>parameters=new HashMap<String,Object>();
	parameters.put("fisrtName",firstName);
	
	parameters.put("lastName",lastName);
	
	parameters.put("amount",amount);
	
	jdbcTemplate.update(sql,parameters);
	}
	
	//delete a person info which is already exists
	
	public void delete(Integer id)
	{
		logger.debug("removing existing person info");
		
		String sql="delete from persson where id=?";
		
		Object[] parameters=new Object[]{id};
		
		jdbcTemplate.update(sql,parameters);
	}
	
	
	
	public  void edit(Integer id,String firstName,String lastName,int amount)
	{
		logger.debug("updating exisitng person info");
		
		String sql="update person set firstName=:firstName,"+"lastName=:lastName,amount=:amount where id=:id";
		
		Map<String,Object>parameters=new HashMap<String,Object>();
		
		parameters.put("id",id);
		parameters.put("firstName", firstName);
		parameters.put("lastName",lastName);
		parameters.put("amount", amount);
		 jdbcTemplate.update(sql,parameters);
		
	}
	
	
	

}
