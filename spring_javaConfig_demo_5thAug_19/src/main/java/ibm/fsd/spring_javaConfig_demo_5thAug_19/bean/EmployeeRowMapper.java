package ibm.fsd.spring_javaConfig_demo_5thAug_19.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setFirstName(rs.getString(2));
		e.setLastName(rs.getString(3));
		e.setEmail(rs.getString(4));
		
		return e;
	}

}
