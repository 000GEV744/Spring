package ibm.fsd.spring_JDBCtemplate_demo_5th_aug_19.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createEmployee(Employees e) {
		try {
			String query="insert into employees(firstName, lastName, email) values(?,?,?)";
			Object obj[]= {e.getFirstName(),e.getLastName(),e.getEmail()};
			jdbcTemplate.update(query,obj);
			System.out.println("done");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
