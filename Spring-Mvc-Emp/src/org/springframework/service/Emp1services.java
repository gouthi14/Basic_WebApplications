package org.springframework.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.domain.Springemp1;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class Emp1services {
	
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Springemp1 p){  
	    String sql="insert into springemp1(id,firstName,lastName,department,salary)values('"+p.getId()+"',"+p.getFirstName()+",'"+p.getLastName()+"','"+p.getDepartment()+"','"+p.getSalary()+"')";  
	    return template.update(sql);  
	}  
	public int update(Springemp1 p){  
	    String sql="update springemp1 set firstName='"+p.getFirstName()+"', lastName='"+p.getLastName()+"',department='"+p.getDepartment()+"' salary="+p.getSalary()+" where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from springemp1 where id="+id+"";  
	    return template.update(sql);  
	}  
	public Springemp1 getEmpById(int id){  
	    String sql="select * from springemp1 where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Springemp1>(Springemp1.class));  
	}  
	public List<Springemp1> getEmployees(){  
	    return template.query("select * from springemp1",new RowMapper<Springemp1>(){  
	        public Springemp1 mapRow(ResultSet rs, int row) throws SQLException {  
	            Springemp1 e=new Springemp1();  
	            e.setId(rs.getInt(1));  
	            e.setFirstName(rs.getString(2));
	            e.setLastName(rs.getString(3));
	            e.setDepartment(rs.getString(4));
	            e.setSalary(rs.getFloat(5));  
	              
	            return e;  
	        }  
	    });  
	}  
	}  