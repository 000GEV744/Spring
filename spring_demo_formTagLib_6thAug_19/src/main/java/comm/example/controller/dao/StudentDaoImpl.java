package comm.example.controller.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import comm.example.controller.Student;
import comm.example.controller.StudentRowMapper;


@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public  String addStudent(Student st) {
		
		jdbcTemplate.update("insert into student (First_Name, Last_name, email, country, Favourite_Language, OS) values(?,?,?,?,?,?)",st.getFirstName(),st.getLastName(),st.getEmail(),st.getCountry(),st.getFavoriteLanguage(),st.getOsStr().toString() );
		return "employee added !";
		
	}

	public void editStudent(Student emp, int stId) {
		jdbcTemplate.update("update student set First_Name=?, Last_name=?, email=?,country=?, Favourite_Language=?, OS=? where id = ?",emp.getFirstName(),emp.getLastName(),emp.getEmail(),emp.getCountry(),emp.getFavoriteLanguage(),emp.getOsStr().toString(),stId);
		System.out.println("updated !");
		
	}

	public void deleteStudent(int stId) {
	
		jdbcTemplate.update("delete from student where id = ?", stId);
		System.out.println("deleted !");
		
	}

	public List<Student> find(int stId) {
		 Object[] obj = {stId};
		 return jdbcTemplate.query("select * from student where id=?",obj, new StudentRowMapper());	
	}

	public List<Student> findAll() {
		
		 List<Student> empList=new ArrayList<Student>();
		 empList=jdbcTemplate.query("select * from student", new StudentRowMapper());
		 return empList;
	}

}
