package comm.example.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student e = new Student();
		e.setId(rs.getInt(1));
		e.setFirstName(rs.getString(2));
		e.setLastName(rs.getString(3));
		e.setEmail(rs.getString(4));
		e.setCountry(rs.getString(5));
		e.setFavoriteLanguage(rs.getString(6));
		e.setSetOStr(rs.getString(7));
		return e;
	}

}
